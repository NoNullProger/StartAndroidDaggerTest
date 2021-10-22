package com.sports.startandroiddaggertest

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey

@Module
class EventHandlerModule {

    @IntoSet
    @Provides
    fun provideAnalyticsIntoSet(): EventHandler {
        return Analytics()
    }

    @IntoSet
    @Provides
    fun provideLoggerIntoSet(): EventHandler {
        return Logger()
    }

    @IntoMap
    @StringKey("analytics")
    @Provides
    fun provideAnalyticsIntoMap(): EventHandler {
        return Analytics()
    }

    @IntoMap
    @StringKey("logger")
    @Provides
    fun provideLoggerIntoMap(): EventHandler {
        return Logger()
    }
}