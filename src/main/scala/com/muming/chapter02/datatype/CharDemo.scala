package com.muming.chapter02.datatype

object CharDemo {
  def main(args: Array[String]): Unit = {

    //    BigInt(2).pow(10)
    //    print(c2)
    //    原因分析：
    //    1.编译器会在底层进行判断和转换
    //    2.把一个字面量赋值给变量，编译器会进行范围判定
    //    var c2: Char = 'a' + 1
    //    var c3: Char = 97 + 1
    //    var c4: Char = 98
    var str: String = "hello world"
    println(str.take(1))
    println(str.takeRight(1))
  }

}
