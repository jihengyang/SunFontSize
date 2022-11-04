package com.sun.sunfontsize

import android.content.Context
import android.content.ContextWrapper
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatViewInflater
import androidx.fragment.app.FragmentActivity

class SecondActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resources.displayMetrics.density = 5.0f
        setContentView(R.layout.activity_second)

        val container = findViewById<ViewGroup>(R.id.container)
        val subView = LayoutInflater.from(object : ContextWrapper(this) {
            override fun getResources(): Resources {
                return Resource
            }
        }).inflate(R.layout.test_layout, container, false)
        container.addView(subView)
    }



    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return if (name == "fragment") {
            super.onCreateView(name, context, attrs)
        } else {
            return SunLayoutFactory().onCreateView(name, context, attrs)
        }

    }
}
