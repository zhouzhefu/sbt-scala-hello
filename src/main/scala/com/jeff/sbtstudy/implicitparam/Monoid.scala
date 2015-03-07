package com.jeff.sbtstudy.implicitparam

/**
 * Created by winniewang on 7/3/15.
 */
abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}
