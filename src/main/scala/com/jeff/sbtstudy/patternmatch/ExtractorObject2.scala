package com.jeff.sbtstudy.patternmatch

/**
 * Created by winniewang on 15/3/15.
 */
object ExtractorObject2 {
  def unapply(z: Int): Option[Any] = {
    println("inside ExtractorObject2.unapply(" + z + ")")
    if (z == 9) {
      Some(Tuple3(9, "is not", 9.13))
    } else {
      None
    }
  }
}
