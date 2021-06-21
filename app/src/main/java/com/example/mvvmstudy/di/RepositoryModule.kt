package com.example.mvvmstudy.di

import com.example.mvvmstudy.data.repo.MVVMRepo
import com.example.mvvmstudy.data.repo.MVVMRepoImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<MVVMRepo> { MVVMRepoImpl(get()) }
}