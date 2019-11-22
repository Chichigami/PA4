/**
 * cse250.pa4.TreeUtilities.scala
 *
 * Copyright 2019 Andrew Hughes (ahughes6@buffalo.edu)
 *
 * This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit
 * http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 * Submission author
 * UBIT: garyfeng
 * Person#: 52042102
 *
 * Collaborators (include UBIT name of each, comma separated):
 * UBIT:
 */
package cse250.pa4

import cse250.objects.{Empty, Node, Tree}

import scala.collection.mutable
import scala.reflect.ClassTag

object TreeUtilities {
  def buildHeapTreeFromHeapArray[A](heapArray: Array[A]): Tree[A] = {
    if (heapArray.isEmpty){
      Empty
    } else {
      for (i <- heapArray.length-1 to 0 by -1){
        if ((i+1) % 2 == 0){ //left
          println(heapArray(i))
          val parentIndex = (i - 1)/2
          val newNode: Node[A] = new Node[A](heapArray(i), Empty, Empty)
        }
        if ((i+2) % 2 == 0){ //right
          println(heapArray(i))
          val parentIndex = (i - 2)/2
          val newNode: Node[A] = new Node[A](heapArray(i), Empty, Empty)

        }
      }
      Empty
    }
  }

  def flattenHeapTreeToHeapArray[A: ClassTag](root: Tree[A]): Array[A] = {
    Array()
  }

  def isValidBinaryHeap[A](root: Tree[A])(implicit comp: Ordering[A]): Boolean = {
    false
  }

  def applyTree[A](root: Tree[A], index: Int): Option[A] = {
    None
  }

  def updateHeap[A](root: Tree[A], index: Int, elem: A)(implicit comp: Ordering[A]): Tree[A] = {
    root
  }
}
