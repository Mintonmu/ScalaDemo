package com.muming.chapter08.abstactdemo.mytrait

object TraitDemo extends App {

  val sheep = new Sheep

  sheep.sayHi()
  sheep.sayHello()

}

/**
  * 当一个trait有抽象方法和非抽象方法
  * 1.一个trait在底层对应两个Trait03.class接口
  * 2.还对应Trait03$class.class Trait03$.class
  *
  **/

trait Trait03 {
  def sayHi()

  def sayHello(): Unit = {
    println("say hello")
  }
}

trait Trait01 {
  def hi()

  def sayhi(): Unit = {
    println("hi")
  }
}

//继承原理
//class Sheep implements Trait03

class Sheep extends Trait03 with Trait01 {
  override def sayHi(): Unit = {
    println("small sheep say hello")
  }

  override def hi(): Unit = {
    println("override hi")
  }
}