package com.ubaya.native160421149

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Log.d("aaaaa","hhhhh")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("bbb","aaaa")
    }
}