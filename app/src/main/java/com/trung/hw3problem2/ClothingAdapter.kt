package com.trung.hw3problem2

import android.R.layout.simple_list_item_1
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast

class ClothingAdapter(private val context: Context, private val clothingList: ArrayList<String>) : BaseAdapter(){

    override fun getCount(): Int {
        return clothingList.size
    }

    override fun getItem(position: Int): Any {
        return clothingList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, p1: View?, parent: ViewGroup?): View {
        val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = inflater.inflate(simple_list_item_1, parent, false)
        val tv1 = rowView.findViewById<TextView>(android.R.id.text1)
        tv1.text = clothingList[position]

        rowView.setOnClickListener {
            Toast.makeText(context, "${clothingList[position]} is clicked", Toast.LENGTH_SHORT).show()
        }

        return rowView
    }


}