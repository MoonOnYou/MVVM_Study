package com.example.mvvmstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmstudy.data.repo.MVVMRepoImpl
import com.example.mvvmstudy.data.source.local.MVVMLocalDataImpl

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
                    return MainViewModel(
                        MVVMRepoImpl.getInstance(MVVMLocalDataImpl.getInstance())
                    ) as T
                } else throw IllegalAccessException()
            }
        }).get(MainViewModel::class.java)

        findViewById<TextView>(R.id.textViewFirst).text = viewModel.getLocalData()
    }
}