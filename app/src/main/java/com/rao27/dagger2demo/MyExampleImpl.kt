package com.rao27.dagger2demo

import java.util.*

class MyExampleImpl : MyExample {
    val date: Long by lazy(LazyThreadSafetyMode.NONE) { Date().time }
    override fun getData(): Long {
        return date
    }
}