package com.rao27.dagger2demo

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyModule {

    @Provides
    @Singleton
    fun provideMyExample(): MyExample {
        return MyExampleImpl()
    }

}