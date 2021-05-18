/*
  Hello world examples
  * look at Function definition style and syntax
  * Feel free to follow along with this section on Scastie

  Exercises for working through together are at the end of this file!!!
 */

// first example - what follows after : is the function return type - Unit is equivalent to void
def helloWorld(): Unit = {
  println("Hello World, welcome to the ...")
}

// Parentesis are optional
def helloWorld(myName: String): Unit = println(s"Hello World!, my name is ${myName}")

// Functions in Scala can be assigned to variables
val helloWorld: String => Unit = (myName: String) => println(s"Hello World!, my name is ${myName}")

// Parameters with default values
def helloWorld2(myName: String = "Sumit"): Unit = println(s"Hello World!, my name is ${myName}")

// For Polymorphic functions this doesn't work so well - you'll need to explicitly provide the input + output types
def op1(a: Int, b: Int, f: (Int, Int) => Int): Int = f(a, b)

// Functions of type scala.Function1, scala.Function2, etc.
var x = () => println("Hello")
x match {
  case _: Function1[_, Unit] => x
}


// Exercises
def sumThreeNumbers(a: Int, b: Int, c: Int): Int = ???
def checkIfANumberIsOddOrEven(a: Int): Boolean = ???
def checkIfAIsBiggerThanB(a: Double, b: Double): Boolean = ???