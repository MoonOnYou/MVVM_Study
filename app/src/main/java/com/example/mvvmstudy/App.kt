package com.example.mvvmstudy

import android.app.Application
import com.example.mvvmstudy.di.repositoryModule
import com.example.mvvmstudy.di.sourceModule
import com.example.mvvmstudy.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        setKoin()
    }

    private fun setKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    viewModelModule,
                    repositoryModule,
                    sourceModule
                )
            )
        }
    }
}
