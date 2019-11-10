package com.raywenderlich.container.navigation.di

import com.raywenderlich.container.navigation.NavigationManager
import com.raywenderlich.container.navigation.impl.NavigationManagerImpl
import dagger.Binds
import dagger.Module

@Module
abstract class NavigationModule {

  @Binds
  abstract fun navigationModule(navigationManager: NavigationManagerImpl): NavigationManager
}