package com.example.simplemetroapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    appGraph: AppGraph
) {
    val viewModel = remember { appGraph.mainViewModel }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Main Screen") }
            )
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier.padding(paddingValues),
        ) {
            Text(
                modifier = Modifier.padding(16.dp),
                text = viewModel.message(),
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}

@Preview
@Composable
private fun PreviewMainScreen() {
    MainScreen(PreviewGraph)
}