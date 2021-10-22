package com.sports.startandroiddaggertest

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ServerApiModule {

//    @Named("prod")
//    @Provides
//    fun provideServerApiProd(): ServerApi {
//        return ServerApi("prod.server.com")
//    }
//
//    @Named("dev")
//    @Provides
//    fun provideServerApiDev(): ServerApi {
//        return ServerApi("dev.server.com")
//    }

    @Prod
    @Provides
    fun provideServerApiProd(): ServerApi {
        return ServerApi("prod.server.com")
    }

    @Dev
    @Provides
    fun provideServerApiDev(): ServerApi {
        return ServerApi("dev.server.com")
    }
}