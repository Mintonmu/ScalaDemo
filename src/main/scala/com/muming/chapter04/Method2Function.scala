package com.muming.chapter04

object Method2Function {
  def main(args: Array[String]): Unit = {
    val dog = new Dog

    println(dog.sum(10, 20))
    //將一個方法轉換為函數
    val f1 = dog.sum _
    println(f1(10, 50))
    val f2 = (n1: Int, n2: Int) => {
      n1 * n2
    }
    //lambda表达式
    println(f2.apply(4, 3))
  }

}

class Dog {
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
