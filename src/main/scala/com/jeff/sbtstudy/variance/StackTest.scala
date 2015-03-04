package com.jeff.sbtstudy.variance


/**
 * Created by winniewang on 4/3/15.
 */
object StackTest extends App {
  //for Stack.push[B >: A](), A is B's super type
  var s: Stack[Any] = new Stack().push("hello")
  s = s.push(new Object()).push(7)
  println(s)

  println

  val cvt = new ContraVarianceType[Object]
  println("cvt is instance of ContraVarianceType[Any]? " + cvt.asInstanceOf[ContraVarianceType[Int]])
}
