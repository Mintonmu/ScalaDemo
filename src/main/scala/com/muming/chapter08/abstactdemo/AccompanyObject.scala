package com.muming.chapter08.abstactdemo

object AccompanyObject extends App {


}

/**
  * 说明：
  *   1.当在同一个文件中有同名的class和object
  *   2.class 称为伴生类，将非静态的内容写到类中
  *   3.object 称为伴生对象，将静态的内容放入到该对象或者类中
  *   4.class 编译后在底层生成xxxx类和xxxx.class
  *   5.object变异后在底层生成xxxx$类和xxxx$.class
  *   6.对于伴生对象的内容，可以直接通过类名.属性或者方法
  *
  **/

//伴生类
class ScalaPerson {
  var name: String = _
}

//伴生对象
object ScalaPerson {

  var sex: Boolean = _
}