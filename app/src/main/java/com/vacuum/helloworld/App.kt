package com.vacuum.helloworld

import android.app.Application
import com.vacuum.helloworld.App.Companion.dagger2
import com.vacuum.helloworld.di.DaggerTestComponant
import com.vacuum.helloworld.di.TestComponant
import com.vacuum.helloworld.di.TestModule
import com.vacuum.helloworld.ui.MainActivity

class App :Application() {
    companion object {
        lateinit var dagger2:TestComponant
    }

    override fun onCreate() {
        super.onCreate()
        initilazied()
    }

    private fun initilazied() {
        dagger2 = DaggerTestComponant
                .builder()
                .testModule(TestModule(this)).build()
    }

}