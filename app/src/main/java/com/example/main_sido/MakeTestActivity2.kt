package com.example.main_sido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_make_test2.*

class MakeTestActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_test2)

        make_test_next_btn_2.setOnClickListener({
            val intent = Intent(this,MakeTestActivity3::class.java)
            startActivity(intent)
        })
    }
}