package com.example.koinbaseapp.data.repository

import com.example.koinbaseapp.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}