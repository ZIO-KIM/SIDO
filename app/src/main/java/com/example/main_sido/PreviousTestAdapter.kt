package com.example.main_sido

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView

class PreviousTestAdapter (val context: Context, val previousList:ArrayList<PreviousTestList>):
    BaseAdapter(){
    //listView에 속한 item의 전체 수 반환
    override fun getCount(): Int {
        return previousList.size
    }
    //해당 위치의 item을 반환
    override fun getItem(position: Int): Any {
        return previousList[position]
    }
    //해당 위치의 item id를 반환
    override fun getItemId(position: Int): Long {
        return 0
    }
    //xml파일의 View와 데이터를 연결
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_previous_test,null)

        val testName = view.findViewById<TextView>(R.id.previous_test_name)
        val testDate = view.findViewById<TextView>(R.id.previous_test_date)
        val previousapply = view.findViewById<Button>(R.id.previous_apply_btn)

        val previous = previousList[position]

        testName.text = previous.testname
        testDate.text = previous.testdate
        previousapply.setOnClickListener({
            //val intent = Intent(this,testjoin2::class.java)
            //startActivity(intent)
        })

        return view
    }

}