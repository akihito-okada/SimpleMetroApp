package com.example.simplemetroapplication

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repo: UserRepository
) : ViewModel() {

    fun message(): String = "Hello, ${repo.userName()}"
}