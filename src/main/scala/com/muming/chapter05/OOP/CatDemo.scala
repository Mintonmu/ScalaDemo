package com.muming.chapter05.OOP

object CatDemo {
  def main(args: Array[String]): Unit = {

    val cat = new Cat
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"

  }

}

class Cat {
  //下面三个属性的访问修饰控制为private，并同时生成name()<=>getter(),name_$eq()<=>setter()
  //必须显式初始化
  var name: String = _
  var age: Int = _ //age一个默认值，int默认是0
  var color: String = _

  var address: String = null //这种是成立的，必须要指定类型,但还是字符串类型
  var Name = null //这个就是null

}

class A {
  var var1: String = _ //null
  var var2: Byte = _
  //0
  var var3: Double = _
  //0.0
  var var4: Boolean = _
  //false
  var var5: Int = _ //0
}
