package com.jeff.sbtstudy.patternmatch

/**
 * Created by winniewang on 15/3/15.
 */
object ExtractorObject {
  def apply(x: Int) = x * x

  def unapply(z: Int): Option[Any] = {
    println("inside ExtractorObject.unapply(" + z + ")")
    if (z % 2 == 0) {
      Some(z / 2)
    } else {
      None
    }
  }
}
