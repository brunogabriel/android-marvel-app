package io.github.brunogabriel.commons.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

open class BaseActivity : AppCompatActivity() {
    fun setToolbar(toolbar: Toolbar?) {
        toolbar?.let {
            setSupportActionBar(it)
        }
    }
}