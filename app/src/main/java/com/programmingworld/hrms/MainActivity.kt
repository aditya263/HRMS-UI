package com.programmingworld.hrms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {

    lateinit var imgSetting: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgSetting = findViewById(R.id.imgSetting)


        imgSetting.setOnClickListener { startActivity(Intent(this@MainActivity, SettingsActivity::class.java)) }
    }
}