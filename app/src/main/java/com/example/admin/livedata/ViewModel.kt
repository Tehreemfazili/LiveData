package com.example.admin.livedata

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private var _observerTextState =  MutableLiveData<String>()  //mutable data is used to update data.. to observe data we use live data
    val observerText : LiveData<String> // it contains the data of mutable data (it has its own method get) It is only used to get value
     get() = _observerTextState //get function of live data returns value of type mutablelivedata


    fun setValue(){

        _observerTextState.value = "Text Changed"

    }
}