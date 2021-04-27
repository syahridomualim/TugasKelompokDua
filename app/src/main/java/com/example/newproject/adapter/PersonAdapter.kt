package com.example.newproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.newproject.R
import com.example.newproject.data.Person
import com.example.newproject.databinding.ItemPersonBinding

class PersonAdapter : RecyclerView.Adapter<PersonAdapter.GridPersonHolder>() {

    private val listPerson = ArrayList<Person>()

    fun setPerson(person: List<Person>?) {
        if (person == null) return
        this.listPerson.clear()
        this.listPerson.addAll(person)

        notifyDataSetChanged()
    }

    class GridPersonHolder(private val binding: ItemPersonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(person: Person) {
            with(binding) {
                tvName.text = person.name
                tvMotto.text = person.motto

                itemView.setOnClickListener {
                    Toast.makeText(itemView.context, person.name, Toast.LENGTH_SHORT).show()
                }
                itemView.isClickable = true
                Glide.with(itemView.context)
                    .load(person.img)
                    .error(R.drawable.error)
                    .apply(RequestOptions().override(640, 640))
                    .into(imagePoster)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridPersonHolder {
        val view = ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return GridPersonHolder(view)
    }

    override fun onBindViewHolder(holder: GridPersonHolder, position: Int) {
        holder.bind(listPerson[position])
    }

    override fun getItemCount(): Int {
        return listPerson.size
    }
}