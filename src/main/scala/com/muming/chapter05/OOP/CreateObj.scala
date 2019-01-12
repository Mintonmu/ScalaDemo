package com.muming.chapter05.OOP

object CreateObj {

  def main(args: Array[String]): Unit = {
    val emp = new Emp
    //子类对象交给父类的引用要声明类型
    val emp2: Person = new Emp
    
  }

}

class Person {

}

class Emp extends Person {

}