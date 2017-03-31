package com.example

object A {
  def foo = List(1).map(identity).filter(_ => true)
}
