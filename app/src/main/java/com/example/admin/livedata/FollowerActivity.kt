package com.example.admin.livedata

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.admin.livedata.databinding.ActivityFollowerBinding

class FollowerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityFollowerBinding = DataBindingUtil.setContentView(this,R.layout.activity_follower)
        var num = Followers("0")

        binding.follower = num
    }
}
