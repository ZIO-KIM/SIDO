package com.example.main_sido

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView

class MyTestAdapter(val context: Context, val mytestList:ArrayList<MyTestList>): BaseAdapter() {
    override fun getCount(): Int {
        return mytestList.size
    }
    override fun getItem(position: Int): Any {
        return mytestList[position]
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_my_test,null)

        val mytestname = view.findViewById<TextView>(R.id.my_test_name)
        val mytestdate = view.findViewById<TextView>(R.id.my_test_date)
        val mytestscore = view.findViewById<Button>(R.id.my_test_score)
        val mytestobjection = view.findViewById<Button>(R.id.my_test_objection)
        val mytestretry = view.findViewById<Button>(R.id.my_test_previous)

        val mytest = mytestList[position]
        mytestname.text  = mytest.mytestname
        mytestdate.text = mytest.mytestdate
        mytestscore.setOnClickListener({
            //val intent = Intent(this,testjoin2::class.java)
            //startActivity(intent)
        })
        mytestobjection.setOnClickListener({
            //val intent = Intent(this,testjoin2::class.java)
            //startActivity(intent)
        })
        mytestretry.setOnClickListener({
            //val intent = Intent(this,testjoin2::class.java)
            //startActivity(intent)
        })
        return view
    }
}