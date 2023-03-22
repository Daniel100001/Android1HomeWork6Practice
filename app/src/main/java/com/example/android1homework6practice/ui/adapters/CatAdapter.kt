package com.example.android1homework6practice.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android1homework6practice.R
import com.example.android1homework6practice.data.CatModel

class CatAdapter(private var listModel: MutableList<CatModel>

) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {


    class CatViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun onBind(catModel: CatModel) {
            image?.let { Glide.with(it.context).load(catModel.image).into(image!!) }
            name?.text = catModel.name
        }

        private var image: ImageView? = null
        private var name: TextView? = null
        private var detail: TextView? = null
        init {
            image = view.findViewById(R.id.image_cat)
            name = view.findViewById(R.id.text_status_code)
        }

    }
    

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        return CatViewHolder(
            LayoutInflater.from(
            parent.context).inflate(R.layout.item_cat, parent , false)
        )
    }

    override fun getItemCount(): Int = listModel.size

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.onBind(listModel[position])
    }
}