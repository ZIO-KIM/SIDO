package com.example.main_sido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_manage_test_detail.*

class ManageTestDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_test_detail)

        mange_test_detail_test_name.text = intent.getStringExtra("testname")
        mange_test_detail_test_description.text = intent.getStringExtra("testdescription")

    }
}