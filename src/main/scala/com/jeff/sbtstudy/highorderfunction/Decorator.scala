package com.jeff.sbtstudy.highorderfunction

/**
 * Created by winniewang on 14/3/15.
 */
class Decorator(left: String, right: String) {
  def layout[A](x: A) = {
    left + x.toString + right
  }
}
