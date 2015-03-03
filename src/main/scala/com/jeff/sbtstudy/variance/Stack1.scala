package com.jeff.sbtstudy.variance

/**
  * Created by winniewang on 3/3/15.
  * "A" at contra-variant position
 *
 * 在这里引入关于这个符号的说明，在声明Scala的泛型类型时，“+”表示协变，而“-”表示逆变。

C[+T]：如果A是B的子类，那么C[A]是C[B]的子类。
C[-T]：如果A是B的子类，那么C[B]是C[A]的子类。
C[T]：无论A和B是什么关系，C[A]和C[B]没有从属关系。
  */
class Stack1[-A] {

   def push[B <: A](elem: B): Stack1[B] = new Stack1[B] {
     override def top[B <: A]: A = elem //it is a bit funny here, actually this class is not suitable for [-A]
     override def pop: Stack1[B] = Stack1.this //because B <: A, therefore Stack1[B] >: Stack1[A]
     override def toString() = elem.toString + " " + Stack1.this.toString
   }

   def top[B <: A]: B = sys.error("no element on stack")
   def pop: Stack1[A] = sys.error("no element on stack")
   override def toString() = ""
 }
