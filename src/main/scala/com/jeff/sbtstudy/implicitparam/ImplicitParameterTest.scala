package com.jeff.sbtstudy.implicitparam

/**
 * Created by winniewang on 7/3/15.
 */
object ImplicitParameterTest extends App {
  implicit object StringMonoid extends Monoid[String] {
    override def unit: String = ""

    override def add(x: String, y: String): String = x concat y
  }

  implicit object IntMonoid extends Monoid[Int] {
    override def unit: Int = 0

    override def add(x: Int, y: Int): Int = x + y
  }

  /*
  Other than interpreting the concept of Implicit Parameter, this example also interprets the Implicit Class (which is
  StringMonoid and IntMonoid in this case). If StringMonoid and IntMonoid are not implicit class, we cannot put the
  implicit parameter in this way: (implicit m: Monoid[A]), but this way: (implicit m: Monoid[A] = new StringMonoid()),
  like what we did in the tryIt().
   */
  def sum[A](xs: List[A])(implicit m: Monoid[A]): A = {
    if (xs isEmpty) m.unit
    else m add(xs.head, sum(xs.tail))
  }

  def tryIt()(implicit m: String = "incredible") = {
    m concat " " concat "Jeff"
  }

  println(sum(List(1,2,3)))
  println(sum(List("a", "b", "c")))
  println(tryIt())
}
