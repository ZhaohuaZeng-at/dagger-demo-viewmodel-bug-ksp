package com.example.testhiltviewmodel.dependencies

import android.util.Log
import javax.inject.Inject

class MyDependency @Inject constructor() {
    fun doSomething() {
        Log.d("MyDependency", "MyDependency.doSomething()")
    }
}
