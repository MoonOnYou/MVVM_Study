package com.example.mvvmstudy.data.repo

import com.example.mvvmstudy.data.source.local.MVVMLocalData
import com.example.mvvmstudy.data.source.local.MVVMLocalDataImpl

class MVVMRepoImpl(private val mvvmLocalData: MVVMLocalData) : MVVMRepo {
    override fun getData(): String {
        return mvvmLocalData.getData()
    }

    companion object {
        private var instance : MVVMRepoImpl? = null
        fun getInstance(mvvmLocalData: MVVMLocalData) : MVVMRepo = instance ?: MVVMRepoImpl(mvvmLocalData).also {
            instance = it
        }
    }
}