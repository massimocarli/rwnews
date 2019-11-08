package com.raywenderlick.common

/**
 * Factory for object of type T
 */
interface Factory<T> {

  val instance: T
    get
}
