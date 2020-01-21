package com.example.admin.livedata.views

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.admin.livedata.R
import com.example.admin.livedata.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        button.setOnClickListener {
            viewModel.setValue()
        }

        buttonNext.setOnClickListener {
            startActivity(Intent(this, FollowerActivity::class.java))

        }

        viewModel.observerText.observe(this, Observer {
            textView2.text = it
        })
    }
}
