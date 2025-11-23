package com.sargis.cmpmemecreator.di

import com.sargis.cmpmemecreator.memeEditor.presentation.MemeEditorViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::MemeEditorViewModel)
}