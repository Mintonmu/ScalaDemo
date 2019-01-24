package com.muming.chapter09.Implicit

object ImplicitDemo01 extends App {

	val num: Int = 3.5

	//隐式转换Double -> Int,其中在c++中只有explicit用于关闭隐式转换
	//只和函数签名有关（返回值和参数类型）

	implicit def DtoI(d: Double): Int = {
		d.toInt
	}

	implicit def FtoI(f: Float): Int = {
		f.toInt
	}

	println(num)
}
