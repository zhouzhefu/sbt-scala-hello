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
   * Pattern Matching with Extractor
   */
  val x = ExtractorObject(4) //note the apply(...) method is used as Constructor, but it is not necessary for an extractor
  x match {
    case ExtractorObject(num) => println(x + " is bigger two times than " + num)
    case _ => println("i cannot calculate. ")
  }

}
