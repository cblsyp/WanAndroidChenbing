package com.pingpang.wanandroidchenbing.utils

import android.content.SharedPreferences

/**
 *kotlin  委托属性+SharedPreference
 */
class Preference<T>(val name: String, private val default: T) {
    companion object {
        private val file_name = "wan_android_file"
        private val prefs:SharedPreferences by lazy {
            App
        }
    }
}