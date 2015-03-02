package com.jeff.sbtstudy.mixincompound

class Clickable(by: String) {
 	def click = println("I was clicked by " + by)
}

trait Openable {
 	def open = println("I was opened!")
}

trait Echo1 {
 	def echo = println("Echo1!")
}

trait Echo2 {
 	def echo = println("Echo2!")
}