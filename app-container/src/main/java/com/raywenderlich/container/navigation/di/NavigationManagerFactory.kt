package com.raywenderlich.container.navigation.di

import com.raywenderlich.common.Factory
import com.raywenderlich.container.navigation.NavigationManager
import com.raywenderlich.container.navigation.impl.NavigationManagerImpl

/**
 * A Factory for a NavigationManager
 */
object NavigationManagerFactory : Factory<NavigationManager> {

  val singleton = NavigationManagerImpl()

  override val instance: NavigationManager
    get() = singleton
}
