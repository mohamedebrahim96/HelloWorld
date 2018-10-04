package com.vacuum.helloworld.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vacuum.helloworld.R
import dagger.Component
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Singleton

class MainActivity : AppCompatActivity() {

    //@Inject lateinit var test:ImageDownloader

    private lateinit var magicBox: MagicBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //App.dagger2.inject(this)
        //test.toImage(image_test,"https://avatars2.githubusercontent.com/u/16405013?s=460&v=4")

        magicBox = DaggerMagicBox.create()
        instance.setOnClickListener {
            val x = Storage()
            magicBox.inject(x)
            counter.text = "Counter=  ${x.normalMagic.counter}"
            singleton.text =  "Singleton=  ${x.uniqueMagic.counter}"
        }


    }
}
 var static_count = 0
class Storage {
    @Inject lateinit var uniqueMagic: UniqueMagic
    @Inject lateinit var normalMagic: NormalMagic
}


@Singleton
class UniqueMagic @Inject constructor(){
    var counter = static_count++
}


class NormalMagic @Inject constructor(){
    var counter = static_count++
}

@Singleton
@Component
interface MagicBox{
    fun inject(m:Storage)
}

