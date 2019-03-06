package com.rao27.dagger2demo

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MyModule::class])
interface MyComponent {

    fun inject(mainActivity: MainActivity)

}