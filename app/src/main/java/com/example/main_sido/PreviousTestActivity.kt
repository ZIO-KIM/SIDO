package com.example.main_sido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_previous_test.*

class PreviousTestActivity : AppCompatActivity() {

    val previouslist = arrayListOf<PreviousTestList>(
        PreviousTestList("SQLD 40회","2021/03/13"),
        PreviousTestList("빅데이터분석기사","2021/04/17")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previous_test)

        val previousAdapter = PreviousTestAdapter(this,previouslist)
        previous_list.adapter = previousAdapter
    }
}