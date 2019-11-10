package com.raywenderlich.container.di

import com.raywenderlich.container.initialization.InitManager
import com.raywenderlich.container.initialization.di.InitModule
import com.raywenderlich.container.navigation.NavigationManager
import com.raywenderlich.container.navigation.di.NavigationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(InitModule::class, NavigationModule::class))
interface ContainerComponent {

  fun initManager(): InitManager

  fun navigationManager(): NavigationManager
}