package com.sports.startandroiddaggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Lazy
import dagger.multibindings.IntoSet
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var databaseHelper: DatabaseHelper

    lateinit var databaseHelperUtilsLazy: Lazy<DatabaseHelper>

    @Inject
    lateinit var networkUtils: NetworkUtils

//    private lateinit var mainActivityPresenter: MainActivityPresenter

//    @Named("prod")
    @Dev
    @Inject
    lateinit var serverApi: ServerApi

    @Inject
    lateinit var eventHandler: Map<String, @JvmSuppressWildcards EventHandler>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        1 вариант
//        val appComponent = (application as App).appComponent
//        databaseHelper = appComponent.getDatabaseHelper()
//        networkUtils = appComponent.getNetworkUtils()

//        2 вариант
        (application as App).appComponent.injectMainActivity(this)

//        mainActivityPresenter = (application as App).appComponent.getMainActivityPresenter()
//        databaseHelperUtilsLazy = (application as App).appComponent.getDatabaseHelperLazy()
//        serverApi = (application as App).appComponent.getServerApiProd()
//        eventHandler = (application as App).appComponent.getEventHandlers()

//            eventHandler = (application as App).appComponent.getEventHandlersIntoMap()


        println("!!!!!!!!!!!!!!!!!!!!event- ${this::eventHandler.isInitialized} ${eventHandler.keys}")

    }
}