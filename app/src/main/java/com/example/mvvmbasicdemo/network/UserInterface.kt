package com.example.mvvmbasicdemo.network

import com.example.mvvmbasicdemo.model.User
import retrofit2.Call
import retrofit2.http.GET

var BaseUrl = "https://api.github.com/"

interface UserInterface {
    @GET("users")
    fun getUserData(): Call<List<User>>
}
