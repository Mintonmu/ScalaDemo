package com.muming.chapter05.OOP

object MemState {

  def main(args: Array[String]): Unit = {

    val p1 = new Person2("ali", 10)
    p1.name = "jack"
    p1.age = 10
    val p2 = p1
    (0 until 10).reverse.foreach(println)
  }

}

class Person2(inName: String, inage: Int) {

  var name: String = inName
  var age: Int = inage

  def this(name: String) {
    //辅助构造器必须在第一行显式调用主构造器
    this("jack", 10)
    this.name = name
  }
}
