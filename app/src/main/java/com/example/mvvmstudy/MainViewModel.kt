package com.example.mvvmstudy

import androidx.lifecycle.ViewModel
import com.example.mvvmstudy.data.repo.MVVMRepo

class MainViewModel(private val mvvmRepo: MVVMRepo) : ViewModel() {
    fun getLocalData() : String {
        return mvvmRepo.getData()
    }
}