package com.jeff.sbtstudy.variance

/**
 * Created by winniewang on 3/3/15.
 * "A" at co-variant position when using [+A]
 */
class Stack[+A] {
  def push[B >: A](elem: B): Stack[B] = new Stack[B] {
    override def top: B = elem
    override def pop: Stack[B] = Stack.this
    override def toString() = elem.toString + " " + Stack.this.toString
  }

  def top: A = sys.error("no element on stack")
  def pop: Stack[A] = sys.error("no element on stack")
  override def toString() = ""
}
