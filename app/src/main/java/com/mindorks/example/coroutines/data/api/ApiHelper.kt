package com.mindorks.example.coroutines.data.api

import com.mindorks.example.coroutines.data.model.ApiUser

interface ApiHelper {

   1111 suspend fun getUsers(): List<ApiUser>
    suspend fun getMoreUsers(): List<ApiUser>
    suspend fun getUsersWithError(): List<ApiUser>

}