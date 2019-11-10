package com.raywenderlich.container.initialization.di

import com.raywenderlich.container.initialization.InitManager
import com.raywenderlich.container.initialization.impl.InitManagerImpl
import dagger.Binds
import dagger.Module

@Module
abstract class InitModule {

  @Binds
  abstract fun initManager(initManager: InitManagerImpl): InitManager
}