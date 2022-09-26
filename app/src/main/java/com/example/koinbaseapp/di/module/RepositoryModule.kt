package com.example.koinbaseapp.di.module

import com.example.koinbaseapp.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}