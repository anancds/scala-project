package com.cds.learnscala.objecttest

abstract class UndoableAction(val description: String) {

  def undo(): Unit = {

  }

  def redo (): Unit = {

  }

}
