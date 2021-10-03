package com.trung.hw3problem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trung.hw3problem2.data.ElectronicProduct
import kotlinx.android.synthetic.main.activity_electronic_detail.*

class ElectronicDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electronic_detail)

        if (intent.hasExtra("product")) {
            (intent.getSerializableExtra("product") as? ElectronicProduct)?.let {
                ivElectronicProduct.setImageResource(
                    when (it.image) {
                        "galaxya42" -> R.drawable.galaxya42
                        "galaxya52" -> R.drawable.galaxya52
                        "iphone" -> R.drawable.iphone
                        "moto" -> R.drawable.moto
                        "tracfone" -> R.drawable.tracfone
                        else -> R.drawable.default_image
                    }
                )
                tvName.text = it.title
                tvColor.text = it.color
                tvDescription.text = it.desc
            }
        }
    }
}