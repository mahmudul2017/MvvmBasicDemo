package com.example.mvvmbasicdemo.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmbasicdemo.R
import com.example.mvvmbasicdemo.databinding.ActivityMainBinding
import com.example.mvvmbasicdemo.model.User
import com.example.mvvmbasicdemo.viewModel.UserViewModel

class MainActivity : AppCompatActivity() {

    lateinit var userViewModel: UserViewModel
 //   val user = ArrayList<User>()
    lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        userViewModel.getAllUsersData()

    //    dataBinding.tvData.text = user.get(0).login
    }
}
