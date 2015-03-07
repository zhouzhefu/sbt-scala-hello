package com.jeff.sbtstudy.innerclass

/**
 * Created by winniewang on 8/3/15.
 */
class Graph {
  class Node {
    var connectedNodes: List[Node] = Nil
    def connectTo(node: Node) = {
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
