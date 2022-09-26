package com.example.koinbaseapp.di.module

import com.example.koinbaseapp.ui.main.viewModel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{
        MainViewModel(get(),get())
    }
}