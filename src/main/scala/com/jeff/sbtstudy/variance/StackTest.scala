package com.jeff.sbtstudy.variance

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type



/**
 * Created by winniewang on 4/3/15.
 */
object StackTest extends App {
  def getArrayString[T <: Any](a: Array[T]): String = {
    var s = ""
    a.foreach((aa) => {s = s + aa + ","})
    s
  }

  //for Stack.push[B >: A](), B is A's super type
  var s: Stack[Any] = new Stack().push("hello")
  println(s)

  s = s.push(new Object())
  println(s)
  s = s.push(7)
  println(s)

  println

  val cvt = new ContraVarianceType[Object]
  println("cvt is instance of ContraVarianceType[Any]? " + cvt.asInstanceOf[ContraVarianceType[Int]])
}
