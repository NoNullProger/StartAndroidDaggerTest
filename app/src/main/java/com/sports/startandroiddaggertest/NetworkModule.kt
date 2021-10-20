package com.sports.startandroiddaggertest

import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtils(): NetworkUtils {
        return NetworkUtils()
    }
}