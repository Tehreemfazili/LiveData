package com.example.admin.livedata.views

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.admin.livedata.Models.Followers
import com.example.admin.livedata.Models.Message
import com.example.admin.livedata.R

import com.example.admin.livedata.databinding.ActivityFollowerBinding
import com.example.admin.livedata.viewModel.FollowersViewModel
import kotlinx.android.synthetic.main.activity_follower.*

class FollowerActivity : AppCompatActivity() {

    var flag = true
    override fun onCreate(savedInstanceState: Bundle?) {
        val count = 0

        super.onCreate(savedInstanceState)

        val binding: ActivityFollowerBinding =
            DataBindingUtil.setContentView(this,
                R.layout.activity_follower
            )
        binding.followerModel = Followers(count.toString())

        val viewModel = ViewModelProviders.of(this).get(FollowersViewModel::class.java)

        followButton.setOnClickListener {

            if (flag) {
                viewModel.follow(viewModel.count + 1)
                viewModel.count = viewModel.count + 1
                viewModel.changeMessage(flag)
                changeButtonTextToUnfollow()

            } else {

                viewModel.follow(viewModel.count - 1)
                viewModel.count = viewModel.count - 1
                viewModel.changeMessage(flag)
                changeButtonTextToFollow()
            }
        }

        viewModel.observeText.observe(this, Observer {

            binding.followerModel = Followers(it.toString())
        })

        viewModel.observeMessage.observe(this, Observer {

            it ?: return@Observer
            binding.messageModel = Message(it)
        })

    }

    private fun changeButtonTextToUnfollow() {

        flag = false
        followButton.setText(getString(R.string.unfollow))
    }

    fun changeButtonTextToFollow() {

        flag = true
        followButton.setText(getString(R.string.follow))
    }
}
