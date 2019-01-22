package com.muming.chapter08.abstactdemo.mytrait

object TraitDemo extends App {

  val sheep = new Sheep

  sheep.sayHi()
  sheep.sayHello()

}


trait Trait03 {
  def sayHi()

  def sayHello(): Unit = {
    println("say hello")
  }
}


class Sheep extends Trait03 {
  override def sayHi(): Unit = {
    println("small sheep say hello")
  }
}