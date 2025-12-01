package com.example.simplemetroapplication

import android.app.Application
import dev.zacsweers.metro.createGraph

class App : Application() {
    lateinit var graph: AppGraph

    override fun onCreate() {
        super.onCreate()
        graph = createGraph<AppGraph>()
    }
}
