package com.sports.startandroiddaggertest

import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDatabaseHelper(repository: Repository): DatabaseHelper {
        return DatabaseHelper(repository)
    }

    @Provides
    fun provideRepository(): Repository {
        return Repository()
    }
}