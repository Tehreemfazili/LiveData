package com.example.admin.livedata

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class FollowersViewModel: ViewModel(){

    var _observeTextState = MutableLiveData<Int>()
    val observeText : LiveData<Int>
        get() = _observeTextState

    var _observeMeessageState = MutableLiveData<String>()
    val observeMessage : LiveData<String>
        get() = _observeMeessageState

    fun setText(count :Int) {

        _observeTextState.value = count + 1
    }

    fun changeMessage(){

        _observeMeessageState.value = "1 Follower Added"
    }
}