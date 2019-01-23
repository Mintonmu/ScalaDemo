package com.muming.chapter08.abstactdemo.mytrait

object DynamicTrait extends App {

  /**
    * 动态混入特质
    **/
  val oracleDb = new OracleDb with Operate

  oracleDb.insert(100)

  val mysql = new Mysql with Operate
  mysql.insert(200)

  //先with后实现抽象方法
  val mysql_2 = new Mysql_2 with Operate {
    override def say(): Unit = println("say")
  }

  mysql_2.say()
  mysql_2.insert(100)

}

trait Operate {
  def insert(id: Int): Unit = {
    println("id:" + id)
  }
}

class OracleDb {}

abstract class Mysql {}

abstract class Mysql_2 {
  def say()
}
