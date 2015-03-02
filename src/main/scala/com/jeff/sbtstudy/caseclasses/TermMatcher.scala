package com.jeff.sbtstudy.caseclasses

object TermMatcher {
	def printTerm(term: Term): Unit = {
		term match {
			case Var(n) => 
				print(n)
			case Fun(x, b) => 
				print("^" + x + ".")
				printTerm(b)
			case App(f, v) => 
				print("(")
				printTerm(f)
				print(" ")
				printTerm(v)
				print(")")
		}
		
	}

	def printExactMatchTerm(term: Term): Unit = {
		term match {
			case Fun("a", Var("c")) =>
				println("Finally got the Mr. Right!")
				printTerm(term)
			case Fun("b", Var("c")) => 
				println("Finally got the Miss Right!")
				printTerm(term)
			case _ => println("No exact matching at all")
		}
	}

	def isIdentityFun(term: Term): Boolean = term match {
		case Fun(x, Var(y)) if x==y => true
		case _ => false
	}

	def main(args: Array[String]): Unit = {
		val id = Fun("x", Var("x"))
		val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
		printTerm(t)
		println
		println(isIdentityFun(id))
		println(isIdentityFun(t))

		println("Let's print [id]")
		printTerm(id)
		println
		println("Let's print exact Fun")
		println
		printExactMatchTerm(Fun("a", Var("c"))) 
		println
		printExactMatchTerm(Fun("b", Var("c"))) 
		println
	}
	

}