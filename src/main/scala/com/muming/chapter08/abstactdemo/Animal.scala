package com.muming.chapter08.abstactdemo

object AbstractClassDetail extends App {

  //动态的实现抽象类

  val animal = new Animal {
    override var name: String = _
    override var age: Int = _

    override def cry(): Unit = {
      println("animal cry")
    }
  }
  animal.cry()

}

abstract class Animal {

  var name: String //抽象属性
  var color: String = "black" //普通属性
  var age: Int //抽象属性

  def cry()
}
