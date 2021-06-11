package com.example.mvvmstudy.data.source.local

class MVVMLocalDataImpl : MVVMLocalData {
    override fun getData(): String {
        return "String1"
    }

    companion object {
        private var instance : MVVMLocalDataImpl? = null
        fun getInstance() : MVVMLocalData = instance ?: MVVMLocalDataImpl().also {
            instance = it
        }
    }
}