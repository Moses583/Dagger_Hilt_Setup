package com.ravemaster.daggerhilttutorial.repository

import androidx.lifecycle.ViewModel
import com.ravemaster.daggerhilttutorial.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {

}