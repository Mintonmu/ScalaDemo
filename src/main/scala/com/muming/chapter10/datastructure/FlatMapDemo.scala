package com.muming.chapter10.datastructure

object FlatMapDemo extends App {

	var names = List("Alice", "Bob", "Nick")

	print(names.flatMap(upptower))

	def upptower(s: String) = {
		s.toUpperCase
	}
}
