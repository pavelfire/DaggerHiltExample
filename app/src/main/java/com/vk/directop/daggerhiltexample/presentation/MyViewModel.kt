package com.vk.directop.daggerhiltexample.presentation

import androidx.lifecycle.ViewModel
import com.vk.directop.daggerhiltexample.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
) : ViewModel() {

    init {
        repository.get()
    }

}