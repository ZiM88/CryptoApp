package com.example.cryptoapp.presentation

import android.app.Application

class CoinApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}