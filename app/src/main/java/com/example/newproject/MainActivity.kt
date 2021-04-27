package com.example.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newproject.adapter.OnItemCallback
import com.example.newproject.adapter.UniversityAdapter
import com.example.newproject.data.University
import com.example.newproject.databinding.ActivityMainBinding

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private val list = ArrayList<University>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        list_item.setHasFixedSize(true)

        showListUniversity()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)

        return true
    }

    private fun showListUniversity() {
        list_item.layoutManager = LinearLayoutManager(this)
        val listUniversityAdapter = UniversityAdapter(list)
        list_item.adapter = listUniversityAdapter
        list.addAll(getListUniversity())
        listUniversityAdapter.setOnClickCallback(object : OnItemCallback {
            override fun onItemClicked(university: University) {
                selectedItem(university)
            }
        })

    }

    private fun selectedItem(university: University) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_DATA, university)
        startActivity(intent)
    }

    private fun getListUniversity(): ArrayList<University> {
        val dataName = resources.getStringArray(R.array.university)
        val dataLocation = resources.getStringArray(R.array.array_location)
        val dataDescription = resources.getStringArray(R.array.array_description)
        val dataImage = resources.getStringArray(R.array.photos)

        val listUniversity = ArrayList<University>()

        for (position in dataName.indices) {
            val university = University (
                dataName[position],
                dataLocation[position],
                dataDescription[position],
                dataImage[position]
            )
            listUniversity.add(university)
        }
        return listUniversity
    }
}