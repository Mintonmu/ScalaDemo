package com.muming.chapter08.abstactdemo

object ScalaFiledOverride extends App {
  val obj: A = new B
  val obj1: B = new B
  //这样相当于是对方法的override
  println("obj\t" + obj.age) //20
  println("obj1\t" + obj1.age) //20

}

class A {
  val age: Int = 10

  //var name: String = ""//编译错误
  def sal(): Int = {
    10
  }
}

class B extends A {
  override val age: Int = 20
  //override val name: String = "jj"
  //val只能重写另一个val的属性
  //val可以重写一个父类的def的无参方法
  override val sal: Int = 1
}
