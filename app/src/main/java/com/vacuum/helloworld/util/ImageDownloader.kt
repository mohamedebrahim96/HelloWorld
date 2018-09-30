package com.vacuum.helloworld.util

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class ImageDownloader(val mContext:Context) {

    fun toImage(image:ImageView,url:String){
        Glide.with(mContext)
                .load(url)
                .into(image)
    }
}