package com.rao27.dagger2demo

import android.app.Application

class Dagger2Demo: Application() {
    private lateinit var myComponent: MyComponent
    override fun onCreate() {
        super.onCreate()
        myComponent = createMyComponent()
    }

    fun getMyComponent() = myComponent

    private fun createMyComponent(): MyComponent{
        return DaggerMyComponent
            .builder()
            .myModule(MyModule())
            .build()
    }
}