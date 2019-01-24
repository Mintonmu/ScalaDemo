package com.muming.chapter09.Implicit

object ImplicitValueDemo2 extends App {

	/**
	  * 编译器优先级为：传值 > 隐式值 >默认值
	  * 其中在隐式匹配的时候不能有二义性
	  *
	  **/
	implicit val str1: String = "scala"

	//	implicit val str2: String = "world" 二义性
	//implicit的值得优先级比默认值要高
	def hello(implicit name: String = "okook"): Unit = {
		println(name + "hello")
	}

	hello
}
