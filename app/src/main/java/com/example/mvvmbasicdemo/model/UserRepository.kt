package com.example.mvvmbasicdemo.model

import android.app.Application
import android.util.Log
import com.example.mvvmbasicdemo.network.UserInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserRepository {
    lateinit var user: User
  /*  lateinit var application: Application

    constructor(application: Application) {
        this.application = application
    }*/

    fun getUserData() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var userData = retrofit.create(UserInterface::class.java)
        userData.getUserData().enqueue(object : Callback<List<User>> {
            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.d("userData ", "${t.printStackTrace()}")
            }

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                if (response.isSuccessful && response.body() != null)
                Log.d("userData ", "${response.body()}")
            }
        })
    }
}
