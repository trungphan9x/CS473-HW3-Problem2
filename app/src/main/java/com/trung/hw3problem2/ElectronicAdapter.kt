package com.trung.hw3problem2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.trung.hw3problem2.data.ElectronicProduct
import kotlinx.android.synthetic.main.item_electronic.view.*
import kotlinx.android.synthetic.main.item_electronic.view.tvColor

class ElectronicAdapter(var context: Context, var electronicList: ArrayList<ElectronicProduct>) : RecyclerView.Adapter<ElectronicAdapter.ViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ElectronicAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_electronic,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ElectronicAdapter.ViewHolder, position: Int) {
        holder.itemView.ivProduct.setImageResource(
            when (electronicList[position].image) {
                "galaxya42" -> R.drawable.galaxya42
                "galaxya52" -> R.drawable.galaxya52
                "iphone" -> R.drawable.iphone
                "moto" -> R.drawable.moto
                "tracfone" -> R.drawable.tracfone
                else -> R.drawable.default_image
            }
        )

        holder.itemView.tvTitle.text = electronicList[position].title
        holder.itemView.tvPrice.text = electronicList[position].price.toString()
        holder.itemView.tvColor.text = electronicList[position].color

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, ElectronicDetailActivity::class.java).apply {
                putExtra("product", electronicList[position])
            })
        }
    }

    override fun getItemCount(): Int {
        return electronicList.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
}