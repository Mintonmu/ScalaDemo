package com.muming.chapter10.datastructure

object FoldDemo01 extends App {

	val list = List(1, 9)
	var a = (1 /: list) ((x, y) => x - y)
	var b = (list :\ 10) ((x, y) => x - y)

	var c = list.scanLeft(2)((x, y) => x * y)
	var d = list.scanRight(7)((x, y) => x * y)
}
