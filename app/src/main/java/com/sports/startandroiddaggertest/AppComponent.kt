package com.sports.startandroiddaggertest

import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {

    // 1 вариант
    fun getDatabaseHelper(): DatabaseHelper
    fun getNetworkUtils(): NetworkUtils

    // 2 вариант
    fun injectMainActivity(mainActivity: MainActivity)
}