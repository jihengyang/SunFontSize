package com.sun.sunfontsize

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView

/**
 * Created by hengyangji on 2022/11/2
 */
class SunLayoutFactory : LayoutInflater.Factory {
    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        var retView: View? = null
        if (name == "TextView") {
            parseSize(context, attrs)
            retView = TextView(context, attrs)
        }
        return retView
    }

    private fun parseSize(context: Context, attrs: AttributeSet) {
        val typeArray = context.obtainStyledAttributes(attrs, R.styleable.FontSizeAttr)
        Log.i("SecondActivity", "parseSize")
    }
}