package com.sargis.cmpmemecreator

import android.app.Application
import com.sargis.cmpmemecreator.di.initKoin
import org.koin.android.ext.koin.androidContext

class MemeCreatorApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MemeCreatorApplication)
        }
    }
}