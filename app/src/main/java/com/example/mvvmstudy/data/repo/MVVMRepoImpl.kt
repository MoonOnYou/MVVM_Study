package com.example.mvvmstudy.data.repo

import com.example.mvvmstudy.data.source.local.MVVMLocalData

class MVVMRepoImpl(private val mvvmLocalData: MVVMLocalData) : MVVMRepo {
    override fun getData(): String {
        return mvvmLocalData.getData()
    }
}