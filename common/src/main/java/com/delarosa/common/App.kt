package com.delarosa.common

import android.app.Application
import com.delarosa.common.di.CommonComponent

class App : Application() {

    lateinit var component: CommonComponent
        private set

    override fun onCreate() {
        super.onCreate()

        component = DaggerCommonComponent
            .factory()
            .create(this)
    }
}