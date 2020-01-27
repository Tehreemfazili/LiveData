package com.example.admin.livedata.Fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.admin.livedata.R
import com.example.admin.livedata.databinding.FragmentFollowerAddedBinding


class ExampleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding : FragmentFollowerAddedBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_follower_added, container, false)
        return fragmentBinding.root
    }
}