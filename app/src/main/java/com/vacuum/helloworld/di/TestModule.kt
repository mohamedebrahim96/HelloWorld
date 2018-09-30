package com.vacuum.helloworld.di

import android.content.Context
import com.vacuum.helloworld.util.ImageDownloader
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class TestModule(val mContext:Context) {

    @Provides @Singleton
    fun ProvideContext():Context{
        return mContext
    }

    @Provides @Singleton
    fun ProvideImageDowloader():ImageDownloader{
        return ImageDownloader(mContext)
    }
}