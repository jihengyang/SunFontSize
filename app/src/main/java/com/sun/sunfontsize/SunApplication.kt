package com.sun.sunfontsize

import android.app.Application
import android.content.Context

/**
 * Created by hengyangji on 2022/10/24
 */
class SunApplication : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        base.resources
    }
}