package com.example.main_sido

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.DatePicker
import android.widget.TextView
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_make_test.*
import kotlinx.android.synthetic.main.activity_my_test.*
import kotlinx.android.synthetic.main.item_my_test.*
import java.util.*

class MakeTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_test)

        make_test_name.setOnEditorActionListener(MyEditorListener())

        //날짜 선택 다이얼로그
        make_test_date_btn.setOnClickListener{
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val date_listener = object:DatePickerDialog.OnDateSetListener{
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                    make_test_date.text = "${year} / ${month+1} / ${dayOfMonth}"
                    make_test_date_btn.visibility = View.INVISIBLE
                }
            }
            val builder = DatePickerDialog(this,date_listener,year,month,day)
            builder.show()
        }
        make_test_next_btn.setOnClickListener({
            val intent = Intent(this,MakeTestActivity2::class.java)
            startActivity(intent)
        })
    }

    inner class MyEditorListener: TextView.OnEditorActionListener{
        override fun onEditorAction(v: TextView?, actionid: Int, event: KeyEvent?): Boolean {
            var handled = false //키보드 내림

            if (actionid==EditorInfo.IME_ACTION_DONE){ //완료버튼 클릭 처리
                make_test_textview.setText(v?.text)
                make_test_name.visibility = View.INVISIBLE
                make_test_date.visibility = View.VISIBLE
                make_test_date_btn.visibility = View.VISIBLE
                make_test_detail_view.visibility=View.VISIBLE
                make_test_next_btn.visibility = View.VISIBLE
                Log.d("TAG","IME_ACTION_DONE : "+v?.text)
            }else if(actionid==EditorInfo.IME_ACTION_NEXT){
                Log.d("TAG","IME_ACTION_NEXT : "+v?.text)
                handled = true //키보드 유지
            }
            return handled
        }
    }
}