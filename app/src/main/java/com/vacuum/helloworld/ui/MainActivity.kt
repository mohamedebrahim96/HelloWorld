package com.vacuum.helloworld.ui

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vacuum.helloworld.App
import com.vacuum.helloworld.R
import com.vacuum.helloworld.util.ImageDownloader
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var test:ImageDownloader



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.dagger22.inject(this)

        test.toImage(image_test,"https://avatars2.githubusercontent.com/u/16405013?s=460&v=4")
    }
}

