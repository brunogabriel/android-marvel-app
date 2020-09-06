package io.github.brunogabriel.marvelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.brunogabriel.main.presentation.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivity.start(this).apply {
            finish()
        }
    }
}