package com.example.mvvmstudy.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.mvvmstudy.R

abstract class BaseActivity<B : ViewDataBinding>(@LayoutRes private val layoutId : Int) : AppCompatActivity() {

    protected lateinit var binding : B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this
        setContentView(binding.root)
    }
}