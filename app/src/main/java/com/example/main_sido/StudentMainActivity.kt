package com.example.main_sido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_student_main.*

class StudentMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_main)

        apply_test.setOnClickListener{
            val intent = Intent(this, ApplyTestActivity::class.java)
            startActivity(intent)
        }
        my_test.setOnClickListener{
            val intent = Intent(this,MyTestActivity::class.java)
            startActivity(intent)
        }
        previous_test.setOnClickListener{
            val intent = Intent(this,PreviousTestActivity::class.java)
            startActivity(intent)
        }
        student_faq.setOnClickListener{
            val intent = Intent(this,StudentFaqActivity::class.java)
            startActivity(intent)
        }
    }
}