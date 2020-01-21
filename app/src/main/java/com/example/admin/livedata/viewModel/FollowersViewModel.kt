package com.example.admin.livedata.viewModel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class FollowersViewModel : ViewModel() {
var count = 0
    var _observeTextState = MutableLiveData<Int>()
    val observeText: LiveData<Int>
        get() = _observeTextState

    var _observeMeessageState = MutableLiveData<String>()
    val observeMessage: LiveData<String>
        get() = _observeMeessageState

    fun follow(count: Int) {

        _observeTextState.value = count

    }

    fun changeMessage(flag: Boolean) {

        if (flag) {
            _observeMeessageState.value = "Follower Added"

        } else {
            _observeMeessageState.value = "Follower Left"
        }
    }

    fun unFollow(count: Int) {

        _observeTextState.value = count

    }
}