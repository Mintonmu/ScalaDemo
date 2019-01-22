package com.muming.chapter08.abstactdemo

object AccompanyApply extends App {
  val pig1 = Pig()
  println(pig1.name)


}

class Pig(pName: String) {

  var name: String = pName
}

object Pig {

  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("pig")
}
