package com.muming.chapter09.Implicit

object ImplicitValueDemo extends App {

	implicit val str1: String = "jack"

	//implicit的值得优先级比默认值要高
	def hello(implicit name: String = "okook"): Unit = {
		println(name + "hello")
	}

	hello
}
