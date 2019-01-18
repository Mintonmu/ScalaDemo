package com.muming.chapter06

package com.muming {

  //创建一个包对象，它是scala包对应的包对象，
  // 每一个包都可以有一个包对象，有且只能有一个，
  // 包对象名称要和包的名称保持一致
  // 包对象中可以定义变量和方法
  package object scala {

    val name = "king"

    def sayHi() = {
      println("package object scala say hi")
    }

  }

  //com.muming
  package scala {

    //com.muming.scala
    //在包中直接写放方法或者定义变量就报错，使用包对象即可

    class Persons {
      //com.muming.scala.Person
      val name = "Nick"

      def play(message: String) = {
        println(this.name + " " + message)
      }
    }

    object Tests {
      def main(args: Array[String]): Unit = {
        println("name:" + name)
        println(sayHi)
        println("ok")
      }
    }

  }


}
