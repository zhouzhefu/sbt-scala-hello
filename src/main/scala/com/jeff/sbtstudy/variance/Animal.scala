package com.jeff.sbtstudy.variance

/**
 * Created by winniewang on 29/3/15.
 */
class Animal {
  def echo: String = {
    println("I am an Animal")
    "I am an Animal"
  }
}

class Bird extends Animal {
  override def echo: String = {
    println("I am a Bird")
    "I am a Bird"
  }
}

class Chicken extends Bird {
  override def echo: String = {
    println("I am a Chicken")
    "I am a Chicken"
  }
}

class Duck extends Bird {
  override def echo: String = {
    println("I am a Duck")
    "I am a Duck"
  }
}
