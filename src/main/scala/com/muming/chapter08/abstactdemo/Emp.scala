package com.muming.chapter08.abstactdemo

object Emp extends App {

}

class Personos {
  var name: String = "tom"

  def printName(name: String): Unit = {

    println("name is :" + name)

  }
}

class Emp extends Personos {
  override def printName(name: String): Unit = {
    println("Emp name is :" + name)
    super.printName(name)
  }
}