package com.example.koinbaseapp.data.api

import com.example.koinbaseapp.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers() : Response<List<User>>
}