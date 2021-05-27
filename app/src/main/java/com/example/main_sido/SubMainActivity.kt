package com.example.main_sido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub_main.*

class SubMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_main)

        submain_student.setOnClickListener {
            val intent = Intent(this, StudentMainActivity::class.java)
            startActivity(intent)
        }

        submain_manager.setOnClickListener({
            val intent = Intent(this,ManagerMainActivity::class.java)
            startActivity(intent)
        })
        login.setOnClickListener({
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        })
    }
}