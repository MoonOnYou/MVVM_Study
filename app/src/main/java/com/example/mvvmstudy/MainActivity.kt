package com.example.mvvmstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmstudy.data.repo.MVVMRepoImpl
import com.example.mvvmstudy.data.source.local.MVVMLocalDataImpl
import com.example.mvvmstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mvvmViewModel by viewModels<MainViewModel> { MVVMViewModelProviderFactoryImpl() }
    private lateinit var activityMainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding.lifecycleOwner = this
        setContentView(activityMainBinding.root)
        activityMainBinding.textViewFirst.text = mvvmViewModel.getLocalData()
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