package com.example.mvvmstudy

import android.os.Bundle
import android.util.Log
import com.example.mvvmstudy.base.BaseActivity
import com.example.mvvmstudy.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val mvvmViewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewModel = mvvmViewModel
        lifecycle.addObserver(mvvmViewModel)

        mvvmViewModel.twoWayLiveData.observe(this) {
            Log.i("결과", it)
        }
    }

    override fun onDestroy() {
        lifecycle.removeObserver(mvvmViewModel)
        super.onDestroy()

    }
}