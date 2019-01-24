package com.muming.chapter09.Implicit

object ImplicitDemo02 extends App {

	implicit def addDelete(mysql: Mysql) = {
		new Db
	}

	val mysql = new Mysql
	mysql.insert()
	mysql.delete()
}

class Mysql {
	def insert(): Unit = {
		println("insert")
	}
}

class Db {
	def delete(): Unit = {
		println("delete")
	}
}
