package com.cds.learnscala.chp14

sealed abstract class BinaryTree1

case class Leaf1(value: Int) extends BinaryTree1

case class Node1(tr: BinaryTree1*) extends BinaryTree1

object Application1 {

  def leafSum1(tree: BinaryTree1): Int = {
    tree match {

      case Node1(r@_*) => r.map(leafSum1).sum
      case Leaf1(v) => v
    }
  }

  def main(args: Array[String]) {
    val r = Node1(Node1(Leaf1(3), Leaf1(8)), Leaf1(2), Node1(Leaf1(5)))
    println(leafSum1(r))

  }
}
