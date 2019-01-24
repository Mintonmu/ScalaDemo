package com.muming.chapter08.abstactdemo.mytrait

object SelfType extends App {


}


///logger是自身类型特质
//相当于trait logger extends Exception，要求混入该特质的类必须是Exception的子类
trait Logger {
	this: Exception =>
	def log(): Unit = {
		println(getMessage)
	}
}


//class Console extends Logger {}

class Console extends Exception with Logger