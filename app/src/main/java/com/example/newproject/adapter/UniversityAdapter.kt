package com.example.newproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.newproject.R
import com.example.newproject.data.University
import kotlinx.android.synthetic.main.item_list.view.*

class UniversityAdapter(private val listUniversity: ArrayList<University>) :
    RecyclerView.Adapter<UniversityAdapter.ListViewHolder>() {

    private var onItemCallback: OnItemCallback? = null

    fun setOnClickCallback(onItemCallback: OnItemCallback) {
        this.onItemCallback = onItemCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(university: University) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(university.photos)
                    .apply(RequestOptions().override(120,120))
                    .error(R.drawable.error)
                    .into(image_poster)

                tv_item_title.text = university.name
                tv_item_location.text = university.location

                itemView.isClickable = true
                itemView.setOnClickListener { onItemCallback?.onItemClicked(university) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) = holder.bind(listUniversity[position])

    override fun getItemCount(): Int = listUniversity.size
}