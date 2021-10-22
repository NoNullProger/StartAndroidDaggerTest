package com.sports.startandroiddaggertest

import dagger.Component
import dagger.Lazy
import javax.inject.Named

@Component(
    modules = [
        StorageModule::class,
        NetworkModule::class,
        MainModule::class,
        ServerApiModule::class,
        EventHandlerModule::class]
)
interface AppComponent {

    //    // 1 вариант
    fun getDatabaseHelper(): DatabaseHelper
    fun getDatabaseHelperLazy(): Lazy<DatabaseHelper>

    //    fun getNetworkUtils(): NetworkUtils
    fun getMainActivityPresenter(): MainActivityPresenter

//    @Named("dev")
//    fun getServerApiProd(): ServerApi


//    //    // 2 вариант
    fun injectMainActivity(mainActivity: MainActivity)
//
//    @Prod
//    fun getServerApiProd(): ServerApi

    fun getEventHandlers(): Set<EventHandler>

    fun getEventHandlersIntoMap(): Map<String, EventHandler>
}