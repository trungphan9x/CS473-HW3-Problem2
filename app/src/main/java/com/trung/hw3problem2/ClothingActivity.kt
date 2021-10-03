package com.trung.hw3problem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clothing.*

class ClothingActivity : AppCompatActivity() {

    val clothingData = arrayListOf<String>("Hat", "Cap", "Shirt", "T-Shirt", "Pants", "Jean", "Socks", "Towel", "Gloves", "Glasses", "Ring", "Hat", "Cap", "Shirt", "T-Shirt", "Pants", "Jean", "Socks", "Towel", "Gloves", "Glasses", "Ring")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clothing)

        setListView()
    }

    private fun setListView() {
        val clothingAdapter = ClothingAdapter(this, clothingData)
        listView.adapter = clothingAdapter
    }
}