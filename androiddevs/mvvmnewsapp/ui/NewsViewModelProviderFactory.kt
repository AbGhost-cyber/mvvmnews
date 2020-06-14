package com.androiddevs.mvvmnewsapp.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androiddevs.mvvmnewsapp.repository.NewsRepository

@Suppress("UNCHECKED_CAST")
class NewsViewModelProviderFactory(val repos:NewsRepository,val app:Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(app,repos) as T
    }


}