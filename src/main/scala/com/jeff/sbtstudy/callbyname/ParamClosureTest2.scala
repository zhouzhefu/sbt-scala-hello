package com.jeff.sbtstudy.callbyname

/**
 * Created by winniewang on 14/3/15.
 */
object ParamClosureTest2 extends App {
  def loop(body: => Unit): LoopUnlessCond = new LoopUnlessCond(body)

  protected class LoopUnlessCond(body: => Unit) {
    def unless(cond: => Boolean): Unit = {
        body
        if (!cond) this.unless(cond)
    }
  }

  var i = 10
  loop {
    println("i = " + i)
    i -= 1
  } unless(i == 0)
}
