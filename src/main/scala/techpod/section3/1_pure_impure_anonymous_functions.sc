/*
  Pure/Impure Functions examples
  Purely for reference at this point

  Also a look at anonymous functions

  Exercises for working through together are at the end of this file!!!
*/

// Simple examples of Pure Functions
def iterateNumberByOne(x: Int): Int = x + 1 // you don't need to provide a return statement - the last line in the function def is the returned object
def squareANumber(x: Int): Int = x ^ 2

// Pure Functions involving Collections
def returnFirstElementInList(in: List[Int]): Int = in.head
def returnSumOfElementsInList(in: List[Int]): Int = in.reduce((a, b) => a + b) // reduce is a Collection method - will follow

// Functions in Scala can be assigned to a Variable
val Y: Int => Int = (x: Int) => x * 20
val A: (Int, Int) => Double = (a: Int, b: Int) => (a + b).toDouble

// Simple examples of Impure Functions
val globallySetConditionVariable = 2

def impureFuncExample1 (a: Int): Int = { // A function whose input doesn't completely depend on the input parameters
  a * 20 + globallySetConditionVariable
}
val impureFuncExample2: Int => Int = (x: Int) => x * 20 + globallySetConditionVariable // same as above def

// Anonymous functions are functions that don't have a name, here is an example with syntax
(a: Int) => a * 100

List(1 ,2 , 3).map(a => a * 2) // Anonymous functions are passed to other functions mostly - especially when using Collections


// Exercises
def raiseAllElementsToPower3(in: List[Int]): List[Int] = ??? // hint: use the map() function
def squareRootAllElements(in: List[Int]): List[Double] = ???