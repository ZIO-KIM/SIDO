package com.example.main_sido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startLoading()
    }
    private fun startLoading() { //2초 후 다음 화면으로 넘어가도록
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(applicationContext, SubMainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}