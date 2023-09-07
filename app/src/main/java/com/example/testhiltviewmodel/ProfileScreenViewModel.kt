package com.example.testhiltviewmodel

import androidx.lifecycle.ViewModel
import com.example.testhiltviewmodel.dependencies.MyDependency
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileScreenViewModel @Inject constructor(
    myDependency: MyDependency,
) : ViewModel() {

    init {
        myDependency.doSomething()
    }

    val state: String = "Hello World"
}
