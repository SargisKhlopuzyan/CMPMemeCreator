package com.sargis.cmpmemecreator.memeEditor.presentation

data class MemeText(
    val id: String,
    val text: String,
    val fontSize: Float = 36f,
    val offsetRationX: Float = 0f,
    val offsetRationY: Float = 0f,
    val rotation: Float = 1f
)
