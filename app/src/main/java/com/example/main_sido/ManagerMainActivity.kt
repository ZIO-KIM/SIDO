package com.example.main_sido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_manager_main.*

class ManagerMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager_main)

        make_test.setOnClickListener {
            val intent = Intent(this, MakeTestActivity::class.java)
            startActivity(intent)
        }
        manager_faq.setOnClickListener{
            val intent = Intent(this,ManagerFaqActivity::class.java)
            startActivity(intent)
        }
        manage_test.setOnClickListener{
            val intent = Intent(this,ManageTestActivity::class.java)
            startActivity(intent)
        }
    }
}