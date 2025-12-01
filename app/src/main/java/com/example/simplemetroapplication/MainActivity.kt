package com.example.simplemetroapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import com.example.simplemetroapplication.ui.theme.SimpleMetroApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleMetroApplicationTheme {
                val appGraph = (LocalContext.current.applicationContext as App).graph
                MainScreen(appGraph)
            }
        }
    }
}