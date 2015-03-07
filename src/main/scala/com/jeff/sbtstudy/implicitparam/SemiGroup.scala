package com.jeff.sbtstudy.implicitparam

/**
 * Created by winniewang on 7/3/15.
 */
abstract class SemiGroup[A] {
  def add(x: A, y: A): A
}
