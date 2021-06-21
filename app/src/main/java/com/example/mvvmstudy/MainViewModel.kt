package com.example.mvvmstudy

import androidx.lifecycle.*
import com.example.mvvmstudy.data.repo.MVVMRepo

class MainViewModel(private val mvvmRepo: MVVMRepo) : ViewModel() , LifecycleObserver{
    private val _localStringLiveData = MutableLiveData<String>()
    val localStringLiveData : LiveData<String> = _localStringLiveData

    val twoWayLiveData = MutableLiveData<String>()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun getLocalData() {
        _localStringLiveData.value = mvvmRepo.getData()
    }
}