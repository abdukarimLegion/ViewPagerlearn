package com.naa.uz.viewpagerlearn.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.naa.uz.viewpagerlearn.R
import com.naa.uz.viewpagerlearn.databinding.ItemViewPagerBinding
import com.squareup.picasso.Picasso

class ImageAdapter(var imageList: ArrayList<String>) : PagerAdapter() {


    private var inflater: LayoutInflater? = null

    override fun getCount(): Int = imageList.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        inflater = LayoutInflater.from(container.context)
        val view = inflater?.inflate(R.layout.item_view_pager, container, false)
        val bind = ItemViewPagerBinding.bind(view!!)

        Picasso.get().load(imageList[position]).into(bind.image)
//        Glide.with(container.context).load(imageList[position])
//            .centerCrop()
//            .placeholder(R.drawable.ic_launcher_foreground)
//            .into(bind.image);
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View

        container.removeView(view)
    }
}