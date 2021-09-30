package com.trung.hw3problem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategoryActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

        val username = intent.getStringExtra("username")
        tv_email_address.text = username


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imageView1 -> Toast.makeText(this, "You have chosen the Electronic category of shopping", Toast.LENGTH_LONG).show()
            R.id.imageView2 -> Toast.makeText(this, "You have chosen the Clothing category of shopping", Toast.LENGTH_LONG).show()
            R.id.imageView3 -> Toast.makeText(this, "You have chosen the Beauty category of shopping", Toast.LENGTH_LONG).show()
            R.id.imageView4 -> Toast.makeText(this, "You have chosen the Food category of shopping", Toast.LENGTH_LONG).show()
        }
    }
}