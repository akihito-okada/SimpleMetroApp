package com.example.simplemetroapplication

interface UserRepository {
    fun userName(): String
}

class UserRepositoryImpl : UserRepository {
    override fun userName(): String = "Metro User"
}