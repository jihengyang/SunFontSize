package com.sun.sunfontsize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.text).setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
    }


}