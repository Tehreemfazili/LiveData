package com.example.admin.livedata

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.admin.livedata.databinding.ActivityFollowerBinding
import kotlinx.android.synthetic.main.activity_follower.*

class FollowerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var count = 0

        super.onCreate(savedInstanceState)

        val binding : ActivityFollowerBinding = DataBindingUtil.setContentView(this,R.layout.activity_follower)
        binding.follower = Followers(count.toString() )

        val viewModel = ViewModelProviders.of(this).get(FollowersViewModel::class.java)



        followButton.setOnClickListener {
            viewModel.setText(count)
                // viewModel.changeMessage()
        }

        viewModel.observeText.observe(this, Observer {

            binding.follower = Followers(it.toString())
            count++
            changeButtonText()
            followerMessage.text = getString(R.string.follower_added)

        })

    }

    fun changeButtonText(){

        followButton.setText(getString(R.string.unfollow))
    }
}
