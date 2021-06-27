package com.example.main_sido

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView

class ManageTestAdapter(val context:Context,val managetestList:ArrayList<ManageTestList>):BaseAdapter(){
    override fun getCount(): Int {
        return managetestList.size
    }
    override fun getItem(position: Int): Any {
        return managetestList[position]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_manage_test,null)

        val managetestname = view.findViewById<TextView>(R.id.manage_test_name)
        val managetestdescription = view.findViewById<TextView>(R.id.manage_test_description)

        val managetest = managetestList[position]
        managetestname.text  = managetest.testname
        managetestdescription.text = managetest.description

        return view
    }

}