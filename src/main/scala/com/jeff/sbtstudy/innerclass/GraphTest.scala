package com.jeff.sbtstudy.innerclass

/**
 * Created by winniewang on 8/3/15.
 */
object GraphTest extends App {
  val g = new Graph
  val n1: g.Node = g.newNode
  val n2: g.Node = g.newNode
  val n3: g.Node = g.newNode
  n1.connectTo(n2)
  n3.connectTo(n1)
  println("Phase 1 completed, no error!")

  val gg = new Graph
  val n4 = gg.newNode
  //n4.connectTo(n1) //compile error: type mismatch for GraphTest.gg.Node vs GraphTest.g.Node
  println("Phase 2 completed, no error!")

  val g1 = new Graph1
  val g2 = new Graph1
  val n11 = g1.newNode
  val n21 = g2.newNode
  n11.connectTo(n21)
  println("Phase 3 completed, no error!")

}
