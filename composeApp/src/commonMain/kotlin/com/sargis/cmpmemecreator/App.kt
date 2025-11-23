package com.sargis.cmpmemecreator

import androidx.compose.runtime.Composable
import com.sargis.cmpmemecreator.core.presentation.NavigationRoot
import com.sargis.cmpmemecreator.core.theme2.CMPMemeCreatorTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    CMPMemeCreatorTheme {
        NavigationRoot()
    }
}