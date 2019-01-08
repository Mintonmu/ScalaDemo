package com.muming.chapter01.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    var age = 10
    age = 15
    val num = 30
    //num = 10
    // 使用val线程安全因此效率比较高，但是val修饰的变量是不能被改变的，相当于加final修饰
    // 如果需要改变当前定义的对象则应该使用var

    val dog = new Dog
    dog.age = 10
    dog.name = "小黑"
  }

}

class Dog {
  // 声明一个变量需要对该变量初始化
  // 声明一个age属性，一个默认值_
  var age: Int = _
  var name: String = ""
}
