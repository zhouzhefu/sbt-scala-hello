package com.jeff.sbtstudy.variance

/**
  * Created by winniewang on 3/3/15.
  * "A" at contra-variant position
 *
 * 在这里引入关于这个符号的说明，在声明Scala的泛型类型时，“+”表示协变，而“-”表示逆变。

C[+T]：如果A是B的子类，那么C[A]是C[B]的子类。
C[-T]：如果A是B的子类，那么C[B]是C[A]的子类。
C[T]：无论A和B是什么关系，C[A]和C[B]没有从属关系。

 还是不明白怎么用逆变
  */
class Stack1[-A] {
}
