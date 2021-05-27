package com.example.main_sido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_apply_test.*

class ApplyTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apply_test)

        apply_next_btn.setOnClickListener({
            val intent = Intent(this,ApplyTestActivity2::class.java)
            startActivity(intent)
        })
    }
}