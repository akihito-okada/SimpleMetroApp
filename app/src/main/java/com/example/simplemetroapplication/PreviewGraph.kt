package com.example.simplemetroapplication

object PreviewGraph : AppGraph {
    override val userRepository: UserRepository = object : UserRepository {
        override fun userName(): String = "Preview User"
    }

    override val mainViewModel: MainViewModel =
        MainViewModel(userRepository)
}