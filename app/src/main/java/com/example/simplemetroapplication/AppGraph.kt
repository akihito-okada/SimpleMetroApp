package com.example.simplemetroapplication

import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Provides

@DependencyGraph
interface AppGraph {

    val userRepository: UserRepository
    val mainViewModel: MainViewModel

    @Provides
    fun provideUserRepository(): UserRepository = UserRepositoryImpl()

    @Provides
    fun provideMainViewModel(
        repo: UserRepository
    ): MainViewModel = MainViewModel(repo)
}