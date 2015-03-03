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

  var s1: Stack1[String] = new Stack1().push(7)
  //s1 = s1.push(new Object())
  println(s1)
}
