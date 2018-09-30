package com.vacuum.helloworld.di

import com.vacuum.helloworld.App
import com.vacuum.helloworld.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestModule::class])
interface TestComponant {
    fun inject(m:MainActivity)
}