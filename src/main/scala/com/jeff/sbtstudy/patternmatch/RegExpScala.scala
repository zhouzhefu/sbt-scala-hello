package com.jeff.sbtstudy.patternmatch

/**
 * Created by winniewang on 15/3/15.
 */
object RegExpScala {
  def containScala(s: String): Boolean = {
    val z: Seq[Char] = s

    z match {
      case Seq('s', 'c', 'a', 'l', 'a', rest @ _*) =>
        println("rest is " + rest)
        true
      case Seq(_*) =>
        false
    }
  }

}
