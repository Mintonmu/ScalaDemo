package com.muming.chapter08.abstactdemo.innerclass.scalainnerclass


object ScalaInnerClassDemo extends App {

	val clazz1 = new ScalaOuterClass()
	val clazz2 = new ScalaOuterClass()


	val inner1 = new clazz1.ScalaInnerClass
	val inner2 = new clazz2.ScalaInnerClass

	inner2.test(inner2)
	//inner1.test(inner2)关联了外部的对象不能像Java一样使用,可以使用类#的方式，叫做类型投影
	val staticinnerclass = new ScalaOuterClass.ScalaStaticInnerClass()

}

class ScalaOuterClass {
	/**
	  * 内部类访问外部类参数方法：
	  *     1.在内部类中使用：外部类名.this.属性名
	  *     2.给外部类加一个别名 写在外部类下 =>
	  * 理解：
	  * 外部类的别名相当于是外部类的一个实例
	  **/
	MyOut =>

	var name = "jack"

	class ScalaInnerClass {
		//类型投影屏蔽外部对象对内部类对象的影响，仅仅考虑类型而忽略对象的创建方式
		def test(ic: ScalaOuterClass#ScalaInnerClass): Unit = {
			println(ic)
		}

		println("name " + MyOut.name)
	}

}

object ScalaOuterClass {


	class ScalaStaticInnerClass {

	}

}