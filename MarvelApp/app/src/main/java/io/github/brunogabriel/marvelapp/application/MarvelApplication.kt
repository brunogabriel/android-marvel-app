package io.github.brunogabriel.marvelapp.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MarvelApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // TODO:
         AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
}