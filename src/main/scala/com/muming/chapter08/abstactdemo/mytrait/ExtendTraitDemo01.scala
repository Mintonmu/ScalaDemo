package com.muming.chapter08.abstactdemo.mytrait

object ExtendTraitDemo01 {

	def main(args: Array[String]): Unit = {

	}

}

//此时当UnhappyException继承这个LoggedException时UnhappyException就是Exception的子类
trait LoggedException extends Exception {
	def log(): Unit = {
		println(getMessage())
	}
}


class UnhappyException extends LoggedException {
	override def getMessage: String = "error message"
}

//这种继承方式 IndexOutOfBoundsException必须是Exception才行，不然会发生多继承

class UnhappyException2 extends IndexOutOfBoundsException with LoggedException {
	override def getMessage: String = "error message"
}

