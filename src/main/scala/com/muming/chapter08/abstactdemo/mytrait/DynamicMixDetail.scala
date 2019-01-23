package com.muming.chapter08.abstactdemo.mytrait

object DynamicMixDetail extends App {

	val aa = new Run with Operate02 {
		override def insert(id: Int): Unit = println("aaa")
	}
	aa.opert = "heihei"
}


trait Operate02 {

	var opert: String = "insert"

	//当一个trait里面同时含有抽象方法和非抽象方法叫做富接口
	def insert(id: Int)

	def myprint(): Unit = {
		println("hahah")
	}
}

//当一个特质继承父类特质的时候，同时还要使用super我们需要将重写的方法变为抽象的
trait FIle extends Operate02 {

	println("hhh")

	abstract override def insert(id: Int): Unit = {
		println("heihe ih")
		super.insert(id)
	}
}

//此时直接混入这个FIle还是抽象的，所以还需要其他trait来实现
//所以直接混入FIle会报错

class Run {

}