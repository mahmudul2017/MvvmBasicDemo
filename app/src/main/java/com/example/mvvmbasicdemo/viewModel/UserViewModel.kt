package com.example.mvvmbasicdemo.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.mvvmbasicdemo.databinding.ActivityMainBinding
import com.example.mvvmbasicdemo.model.UserRepository

class UserViewModel(application: Application) : AndroidViewModel(application) {
    lateinit var userRepository: UserRepository
    lateinit var dataBinding: ActivityMainBinding

    init {
        userRepository = UserRepository()
    }

    fun getAllUsersData() {
        return userRepository.getUserData()
    }
}