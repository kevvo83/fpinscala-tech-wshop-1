/*
  A higher-order function is a function that takes another function as an argument. The use of higher-order functions
  is very commonly found style in Functional Programming.

  Two major examples of the use of higher-order functions are:
  1. When using map(), flatMap(), foldLeft(), etc. on Collections
  2. When generalizing functions
 */

// Anonymous functions are functions that don't have a name, here is an example with syntax
(a: Int) => a * 100

// Anonymous functions are passed to other functions mostly - especially when using Collections
List(1 ,2 , 3).map(a => a * 2)

// Passing a named function to a collection method
val squareInt: Int => Int = (in : Int) => in * in
List(1, 2, 3).map(squareInt)


val in: List[Int] = List(10, 22, 44, 28, 299, 11)

// How to double each element in a List
val out = in.map(x => x * 2)
out.foreach(x => println(x))

def main(in: Array[String]): Unit = {

}



// Problem Statement: A function that checks that the sum of 2 numbers meets a criteria
def checkThatSumOf2NumbersIsGreaterThan100(a: Int, b: Int): Boolean = (a + b) match {
  case _ > 100 => true
  case _ => false
}

def checkThatSumOf2NumbersIsLessThan100(a: Int, b: Int): Boolean = (a + b) match {
  case _ < 100 => true
  case _ => false
}

def checkThatSumOf2NumbersMeetsAProperty(a: Int, b: Int)(f: Int => Boolean): Boolean = f(a + b)

// Function Currying
def op(a: Int, b: Int)(f: (Int, Int) => Int): Int = f(a, b)


// Exercises
def dropWhile(in: List[Int])(f: (Int) => Boolean): List[Int] = ??? // hint: use Lists filter() method
def operateOverAllElementsOfAList(in: List[Int])(f: (Int) => Double): List[Double] = ??? // hint: use Lists map() method



// def factorial(in: Int): Int = Range(1, in).toList.reduce(_ * _)

