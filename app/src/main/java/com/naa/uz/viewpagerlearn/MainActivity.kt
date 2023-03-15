package com.naa.uz.viewpagerlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.naa.uz.viewpagerlearn.adapter.ImageAdapter
import com.naa.uz.viewpagerlearn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var imageList : ArrayList<String>
lateinit var imageAdapter: ImageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImage()
        imageAdapter = ImageAdapter(imageList)
        binding.viewPager.adapter = imageAdapter
    }

    private fun loadImage() {
        imageList= ArrayList()

        imageList.add("https://storage.kun.uz/source/thumbnails/_medium/9/Xb2q5ZI6gzrgLslLWQXTJjCUEnH14ySN_medium.jpg")
        imageList.add("https://storage.kun.uz/source/thumbnails/_medium/9/kjil3yrWzNf6rQa5uhTwdJ41fi3E-MW4_medium.jpg")
        imageList.add("https://storage.kun.uz/source/thumbnails/_medium/9/AiibIiZjtj3AKMILBYSrKBfu9T6Svz7c_medium.jpg")
    }
}