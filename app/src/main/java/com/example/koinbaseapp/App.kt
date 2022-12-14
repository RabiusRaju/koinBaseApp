package com.example.koinbaseapp

import android.app.Application
import com.example.koinbaseapp.di.module.appModule
import com.example.koinbaseapp.di.module.repoModule
import com.example.koinbaseapp.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}
