package com.jeff.sbtstudy.patternmatch

/**
 * Created by winniewang on 15/3/15.
 *
 * Right-ignoring pattern, it was retracted by Scala for a period but it seems working again in v2.11
 * Anyway, it is not a very useful feature.
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
