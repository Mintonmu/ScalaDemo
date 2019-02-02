package com.muming.chapter10.Stream

object StreamAndViewDemo extends App {
	val viewSquares1 = (1 to 100).map(multiple).filter(eq)
	val viewSquares2 = (1 to 100).view.map(multiple).filter(eq)

	println(viewSquares1) //Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99)
	viewSquares1.foreach(println)


	println("----------------------")

	println(viewSquares2) //SeqViewMF(...)
	viewSquares2.foreach(println)

	//lazy末尾元素
	def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)

	def multiple(num: Int) = num

	def eq(i: Int) = i.toString.equals(i.toString.reverse)

}
