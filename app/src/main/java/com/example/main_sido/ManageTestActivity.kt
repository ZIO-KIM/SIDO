package com.example.main_sido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_manage_test.*

class ManageTestActivity : AppCompatActivity() {

    val managetestlist = arrayListOf<ManageTestList>(
        ManageTestList("정보처리기사", "시험에 관련된 설명입니다."),
        ManageTestList("정보처리기사", "시험에 관련된 설명입니다."),
        ManageTestList("정보처리기사", "시험에 관련된 설명입니다.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_test)

        val managetestAdapter = ManageTestAdapter(this, managetestlist)
        manage_test_list.adapter = managetestAdapter
        manage_test_list.setOnItemClickListener { parent, view, position, id ->
            val clickedTest = managetestlist[position]
            val intent = Intent(this, ManageTestDetailActivity::class.java)
            intent.putExtra("testname", clickedTest.testname)
            intent.putExtra("testdescription", clickedTest.description)
            startActivity(intent)

        }

    }
}