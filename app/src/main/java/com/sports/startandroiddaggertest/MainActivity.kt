package com.sports.startandroiddaggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseHelper: DatabaseHelper

    @Inject
    lateinit var networkUtils: NetworkUtils

    private lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        1 вариант
//        val appComponent = (application as App).appComponent
//        databaseHelper = appComponent.getDatabaseHelper()
//        networkUtils = appComponent.getNetworkUtils()

//        2 вариант
//        (application as App).appComponent.injectMainActivity(this)

        mainActivityPresenter = (application as App).appComponent.getMainActivityPresenter()

//        println("!!!!!!!!!!!!!!!!!!!!databaseHelper- ${this::databaseHelper.isInitialized}")

    }
}