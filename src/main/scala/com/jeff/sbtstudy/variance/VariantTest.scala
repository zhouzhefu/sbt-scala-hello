package com.jeff.sbtstudy.variance

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type



/**
 * Created by winniewang on 4/3/15.
 */
object VariantTest extends App {
  def getArrayString[T <: Any](a: Array[T]): String = {
    var s = ""
    a.foreach((aa) => {s = s + aa + ","})
    s
  }

  println("Test Co-Variant...")
  //for Stack.push[B >: A](), B is A's super type
  //since s is always in the type of Stack[Any], its 'view' never change
  println("Stack[Any] all the way...")
  var s: Stack[Any] = new Stack().push("hello")
  println(s)

  s = s.push(new Object())
  println(s)
  s = s.push(7)
  println(s.getClass)
  println(s)

  println

  println("Type rolling all the way")
  var s1: Stack[AnyVal] = new Stack[Int]().push(7)
  var s2: Stack[Any] = s1.push(null)
  println(s2)

  println

  println("Test Contra-Variant...")
  /**
   * Created by winniewang on 4/4/15.
   * "T" at contra-variant position
   *
   * 在这里引入关于这个符号的说明，在声明Scala的泛型类型时，“+”表示协变，而“-”表示逆变。

      C[+T]：如果A是B的子类，那么C[A]是C[B]的子类。
      C[-T]：如果A是B的子类，那么C[B]是C[A]的子类。
      C[T]：无论A和B是什么关系，C[A]和C[B]没有从属关系。

       C作为“容器”，可能是一个类型参数为T的集合，也可能是一个类定义参数为T的类，甚至是一个以T为泛型参数的函数。

    下面是一个以T为逆变参数的函数，因为 Animal是Bird的父类，所以（nimal => String) 是 (Bird => String) 的子类，
    因此 (Animal => String) 可以赋值给 getTweet
   */
  def getTweet:(Bird => CharSequence) = ((a: Animal) => a.echo)


}
