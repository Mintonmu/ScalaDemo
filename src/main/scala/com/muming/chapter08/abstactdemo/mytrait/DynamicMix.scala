package com.muming.chapter08.abstactdemo.mytrait

object DynamicMix extends App {

	val mysql = new MYSQL with DB with File
	//从后往前执行

	mysql.insert(1)
	//先执行file然后应该执行DB（因为是动态混入的父类不一定是继承的）
	// 如果左边没有特质了则super执行的就是自己的父亲特质
}

trait operator {
	println("operator")

	def insert(id: Int)
}


trait Data extends operator {
	println("data")

	override def insert(id: Int): Unit = println("id:" + id)
}

trait DB extends Data {
	println("Db")

	override def insert(id: Int): Unit = {
		println("数据库")
		super.insert(id)
	}
}

trait File extends Data {
	println("file")

	override def insert(id: Int): Unit = {
		println("to file")

		super.insert(id)
	}
}


class MYSQL {

}