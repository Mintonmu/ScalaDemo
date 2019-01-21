package com.muming.chapter08.abstactdemo

object TypeConvert {


  def main(args: Array[String]): Unit = {
    //classof可以得到类名
    println(classOf[String])

  }

  def test(p: people): Unit = {
    if (p.isInstanceOf[emple]) {
      //要先判断父类的对象是否可以转换为子类对象
      p.asInstanceOf[emple].cry() //对p的类型没有改变，返回的类型是emple
  }

  }
}


class people {
  def printName(): Unit = {
    println("people method")
  }

  def sayok(): Unit = {
    println("people method say ok")
  }
}

class student extends people {
  val stuid = 100

  override def printName(): Unit = {
    println("student printname")
  }

  def cry(): Unit = {
    println("show stuid" + stuid)
  }
}


class emple extends people {
  val empid = 100

  override def printName(): Unit = {
    println("emp printname")
  }

  def cry(): Unit = {
    println("show empid" + empid)
  }
}