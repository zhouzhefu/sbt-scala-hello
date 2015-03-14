package com.jeff.sbtstudy.callbyname

/**
 * Created by winniewang on 14/3/15.
 */
object ParamClosureTest extends App {
  def whileLoop(cond: => Boolean)(body: => Unit): Unit = {
    if (cond) {
      body
      whileLoop(cond)(body)
    }
  }

  var i = 10
  whileLoop(i > 0) {
    println("i = " + i)
    i -= 1
  }
}
