package com.sargis.cmpmemecreator.memeEditor.presentation.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import com.sargis.cmpmemecreator.memeEditor.presentation.util.rememberFillTextStyle
import com.sargis.cmpmemecreator.memeEditor.presentation.util.rememberStrokeTextStyle

@Composable
fun OutlinedImpactTextField(
    text: String,
    onTextChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    strokeTextStyle: TextStyle = rememberStrokeTextStyle(),
    fillTextStyle: TextStyle = rememberFillTextStyle(),
    maxWidth: Dp? = null,
    maxHeigh: Dp? = null
) {
    val measurer = rememberTextMeasurer()
    val constraints = calculateTextConstraints(maxWidth, maxHeigh)
    val textLayoutResult = remember {
        measurer.measure(
            text = text,
            style = strokeTextStyle,
            constraints = constraints
        )
    }

    val textBoundSize = with(LocalDensity.current) {
        DpSize(
            width = textLayoutResult.size.width.toDp(),
            height = textLayoutResult.size.height.toDp()
        )
    }

    BasicTextField(
        value = text,
        onValueChange = {
            onTextChange(it.uppercase())
        },
        cursorBrush = SolidColor(Color.White),
        singleLine = false,
        textStyle = fillTextStyle,
        decorationBox = { innerTextField ->
            Text(
                text = text,
                style = strokeTextStyle,
            )
            innerTextField()
        },
        modifier = modifier
            .size(textBoundSize)
    )
}

@Composable
private fun calculateTextConstraints(maxWidth: Dp?, maxHeigh: Dp?): Constraints {
    val density = LocalDensity.current
    return with(density) {
        Constraints(
            maxWidth = maxWidth?.roundToPx() ?: Int.MAX_VALUE,
            maxHeight = maxHeigh?.roundToPx() ?: Int.MAX_VALUE
        )
    }
}