package com.example.newproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.newproject.adapter.PersonAdapter
import com.example.newproject.databinding.ActivityAboutUsBinding
import com.example.newproject.util.DataDummy

class AboutUsActivity : AppCompatActivity() {

    private lateinit var aboutUsBinding: ActivityAboutUsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aboutUsBinding = ActivityAboutUsBinding.inflate(layoutInflater)

        setContentView(aboutUsBinding.root)

        if (applicationContext != null) {
            val person = DataDummy.generateDummyPerson()
            val adapter = PersonAdapter()
            adapter.setPerson(person)

            with(aboutUsBinding.listPerson) {
                layoutManager = GridLayoutManager(this@AboutUsActivity, 2)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }
}