package com.example.main_sido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_test.*

class MyTestActivity : AppCompatActivity() {

    val mytestlist = arrayListOf<MyTestList>(
        MyTestList("한국사능력검정시험 51회","2021/02/06"),
        MyTestList("ADP 필기 20회","2021/03/13"),
        MyTestList("SQLD 40회","2021/03/20")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_test)

        val mytestAdapter = MyTestAdapter(this,mytestlist)
        my_test_list.adapter = mytestAdapter

    }
}