package com.muming.chapter09.Implicit

object ImplicitClass extends App {


	//DB1是一个隐式类,不能单独声明为一个类，必须在一个类或者伴生对象或者包对象中
	//隐式类不能是样例类，且不能嵌套使用
	//不能重复定义
	implicit class DB1(val m: MYSQL1) {
		def addSuffix() = {
			m + "scala"
		}
	}

	val mysql = new MYSQL1
	println(mysql.addSuffix())
}


class MYSQL1 {
	def sayOK(): Unit = {
		println("sayOK")
	}
}