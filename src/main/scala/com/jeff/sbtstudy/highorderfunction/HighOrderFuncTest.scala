package com.jeff.sbtstudy.highorderfunction

/**
 * Created by winniewang on 14/3/15.
 *
 * Need some time to understand how to harness with the high order function in practical project usecase.
 */
object HighOrderFuncTest extends App {
  def apply(f: Int => String, v: Int) = f(v)

  val decorator = new Decorator("[", "]")
  println(apply(decorator.layout, 7))
}
