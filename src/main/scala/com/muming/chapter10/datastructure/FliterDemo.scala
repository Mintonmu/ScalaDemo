package com.muming.chapter10.datastructure

object FliterDemo extends App {

	var names = List("Alice", "Bob", "Nick")

	print(names.filter(startA))

	def startA(s: String) = {
		s.startsWith("A")
	}
}
