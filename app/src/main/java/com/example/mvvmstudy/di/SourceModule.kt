package com.example.mvvmstudy.di

import com.example.mvvmstudy.data.source.local.MVVMLocalData
import com.example.mvvmstudy.data.source.local.MVVMLocalDataImpl
import com.example.mvvmstudy.data.source.local.MVVMLocalDataImpl2
import org.koin.dsl.module

val sourceModule = module {
    single<MVVMLocalData> { MVVMLocalDataImpl() }
//    single<MVVMLocalData> { MVVMLocalDataImpl2() }  // 이렇게 하는거 아닌가...
}