package com.jeff.sbtstudy.patternmatch

/**
 * Created by winniewang on 15/3/15.
 */
object PatternMatchTest extends App {

  /**
   * Match a known type parameter, it is almost the same as 'switch' in Java.
   * @param x
   * @return
   */
  def matchTest1(x: Int): String = x match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Many"
  }

  /**
   * Match Any type param, and return type also Any typed.
   * @param x
   * @return
   */
  def matchTest2(x: Any): Any = x match {
    case "one" => 1
    case 2 => "two"
    case y: Int => "Scala.Int: " + y
  }

  /*
   * For case class Pattern Matching, refer to example in caseclass.TermMatcher
   */


  println(matchTest1(2))

  println(matchTest2(100))

  /**
   * Pattern Matching with Extractor.
   *
   * You don't need a Case Class, to allow a value to 'match' anything, as long as it implements 'unapply()'.
   * Maybe, it reflects the fundamental mechanism of the matching of Case Class or anything primitively supported.
   */
  //note the apply(...) method is used as Constructor, but it is not necessary for an extractor
  val x = ExtractorObject(3/*try '3', '4', '5' for different interpretation*/)
  println(x + " as " + x.getClass.getCanonicalName) //4*4 = 16, the result of apply(4)
  x match {
    case ExtractorObject(num) /* 'num = ExtractorObject.unapply(x)' called here */ => println(x + " is bigger two times than " + num)
    case ExtractorObject2(tuple) => println("Get a nice tuple: " + tuple)
    case 25 => println("I am just 25")
    case _ => println("i cannot calculate. ")
  }


  /**
   * Match a Seq(Char)
   */
  RegExpScala.containScala("scala is awesome!")
}
