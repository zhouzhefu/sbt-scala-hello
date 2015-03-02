package com.jeff.sbtstudy.abstracttype

object AbstractTypeTest1 extends App {
	def newIntSeqBuffer(elem1: Int, elem2: Int): SeqIntBuffer = 
		new SeqIntBuffer {
			type T = List[U]
			val element = List(elem1, elem2)
		}
	
	val buf = newIntSeqBuffer(5, 7)
	println("length = " + buf.length)
	println("content = " + buf.element)
}