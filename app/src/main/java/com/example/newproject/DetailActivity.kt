package com.example.newproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.newproject.data.University
import com.example.newproject.databinding.ActivityDetailBinding
import com.example.newproject.databinding.ContentDetailBinding
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ContentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val contentDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        binding = contentDetailBinding.detailContent
        setContentView(contentDetailBinding.root)

        val data = intent.getParcelableExtra<University>(EXTRA_DATA)

        setSupportActionBar(contentDetailBinding.toolbar)
        supportActionBar?.title = data?.name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        showContent(data)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun showContent(data: University?) {
        Glide.with(this)
            .load(data?.photos)
            .error(R.drawable.error)
            .into(circleImageView)
        binding.textView.text = data?.name
        binding.detailLocation.text = data?.location

    }
}