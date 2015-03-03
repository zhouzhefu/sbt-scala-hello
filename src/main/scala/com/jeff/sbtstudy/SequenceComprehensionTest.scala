package com.jeff.sbtstudy

/**
 * Created by winniewang on 3/3/15.
 */
object SequenceComprehensionTest {

  def main(args: Array[String]) {
    println(even(0, 20))
    println
    println(foo(20, 32))
    println
    bar(20, 32)
  }

  //a very simple sequence comprehension, for getting the even numbers from a nature numbers sequence
  //for (...enumerator...)
  def even(start: Int, end: Int) = {
    for (i <- List.range(start, end) if i % 2 == 0) yield i
  }

  //a little more complicated example, which computes all pairs of numbers between 0 and n-1 whose sum is equal to a given value v
  def foo(f: Int, v: Int) = {
    for (i <- 0 until f ; j <- i until f if i + j == v) yield Tuple2(i, j)
  }

  //this time does not return anything, but make it a side-effect (printing in console)
  def bar(f: Int, v: Int): Unit = {
    for (i <- 0 until f ; j <- i until f if i + j == v) println("(" + i + ", " + j + ")")
  }

}
