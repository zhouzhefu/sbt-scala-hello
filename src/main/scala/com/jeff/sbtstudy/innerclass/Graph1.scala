package com.jeff.sbtstudy.innerclass

/**
  * Created by winniewang on 8/3/15.
 *
 * Graph1#Node means the type Node is at the scope of Graph1 class. If no class prefix, it means Node is just
 * at scope of current instance of Graph1, see example in class Graph.scala
  */
class Graph1 {
   class Node {
     var connectedNodes: List[Graph1#Node] = Nil
     def connectTo(node: Graph1#Node) = {
       if (connectedNodes.find(node.equals).isEmpty) {
         connectedNodes = node :: connectedNodes
       }
     }
   }

   var nodes: List[Node] = Nil
   def newNode: Node = {
     val res = new Node
     nodes = res :: nodes
     res
   }
 }
