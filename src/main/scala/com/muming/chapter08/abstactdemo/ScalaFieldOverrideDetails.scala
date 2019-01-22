package com.muming.chapter08.abstactdemo

object ScalaFieldOverrideDetails extends App {


}

abstract class TestScalaField {
  //当一类有抽象属性，该类应该标记为抽象类，
  //对于抽象的属性，在底层不会生成对应的属性声明，而是生成了两个对应的抽象方法
  //分别是name()和 name_$eq()
  var name: String

}

class TestScalaCreate extends TestScalaField {
  override var name: String = _
}
