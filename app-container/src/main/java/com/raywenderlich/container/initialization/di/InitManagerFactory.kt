package com.raywenderlich.container.initialization.di

import com.raywenderlich.common.Factory
import com.raywenderlich.container.initialization.InitManager
import com.raywenderlich.container.initialization.impl.InitManagerImpl

/**
 * A Factory for a InitManager
 */
object InitManagerFactory : Factory<InitManager> {
  override val instance: InitManager
    get() = InitManagerImpl()
}
