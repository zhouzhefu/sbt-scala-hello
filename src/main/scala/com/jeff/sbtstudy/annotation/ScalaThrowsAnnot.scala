package com.jeff.sbtstudy.annotation

import java.io.IOException


object ScalaThrowsAnnot {

	@throws(classOf[IOException])
	def doException = {
		println("Just Do sth would throw Exception")
	}
}