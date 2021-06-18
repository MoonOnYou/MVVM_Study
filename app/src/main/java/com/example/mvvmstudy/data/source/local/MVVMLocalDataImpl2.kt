package com.example.mvvmstudy.data.source.local

class MVVMLocalDataImpl2 : MVVMLocalData {
    override fun getData(): String {
        return "String2"
    }

    companion object {
        private var instance : MVVMLocalDataImpl2? = null
        fun getInstance() : MVVMLocalData = instance ?: MVVMLocalDataImpl2().also {
            instance = it
        }
    }
}