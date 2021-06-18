package com.example.mvvmstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmstudy.data.repo.MVVMRepoImpl
import com.example.mvvmstudy.data.source.local.MVVMLocalDataImpl

class MainActivity : AppCompatActivity() {
    private val mvvmViewModel by viewModels<MainViewModel> { MVVMViewModelProviderFactoryImpl() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<TextView>(R.id.textViewFirst).text = mvvmViewModel.getLocalData()
    }
}

class MVVMViewModelProviderFactoryImpl : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(
                    MVVMRepoImpl.getInstance(MVVMLocalDataImpl.getInstance())
            ) as T
        } else throw IllegalAccessException()
    }
}