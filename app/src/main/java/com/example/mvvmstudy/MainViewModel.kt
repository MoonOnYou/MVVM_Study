package com.example.mvvmstudy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmstudy.data.repo.MVVMRepo

class MainViewModel(private val mvvmRepo: MVVMRepo) : ViewModel() {
    private val _localStringLiveData = MutableLiveData<String>()
    val localStringLiveData : LiveData<String> = _localStringLiveData

    fun getLocalData() {
        _localStringLiveData.value = mvvmRepo.getData()
    }
}