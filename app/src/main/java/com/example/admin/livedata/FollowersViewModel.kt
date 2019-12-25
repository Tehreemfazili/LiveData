package com.example.admin.livedata

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class FollowersViewModel: ViewModel(){

    var _observeTextState = MutableLiveData<String>()
    val observeText : LiveData<String>
        get() = _observeTextState

    fun setText(){


    }
}