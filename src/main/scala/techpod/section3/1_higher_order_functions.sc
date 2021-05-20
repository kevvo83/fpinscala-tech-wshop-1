// Example: Anonymous functions vs. Named functions
(a: Int) => a * 100 // Anonymous Function

// Example: Named functions
def add2Numbers: (Int, Int) => Int = (a, b) => a + b
val add2Numbers2 = (a: Int, b: Int) => a + b


// Example: Function signature of a function that can run any operation on 2 numbers
def func(a: Int, b: Int)(op: (Int, Int) => Int): Int = op(a, b)

func(10, 20)((a, b) => a + b) // using anonymous functions
func(20, 10)((a, b) => a * b) // using anonymous functions
func(99, 100)(add2Numbers) // using named functions

// Example: using the sortWith() collections function to sort in ascending or descending order
List(2, 4, 0, 9, 1, 8, 2, 5).sortWith((a, b) => a > b)
List(2, 4, 0, 9, 1, 8, 2, 5).sortWith((a, b) => a < b)

// Example: Using an anonymous function with a collection method
List(1 ,2 , 3).map(a => a * 2)

// Example: Using a named function with a collection method - plus different ways of expressing this
val doubleANumber = (in: Int) => in * 2
List(1, 2, 3).map(doubleANumber)
List(1, 2, 3).map(doubleANumber(_)) // _ is a placeholder character - in this case, it means each element in the list
List(1, 2, 3).map(x => doubleANumber(x))


def main(in: Array[String]): Unit = {

}


// Function Currying
def op(a: Int, b: Int)(f: (Int, Int) => Int): Int = f(a, b)


// Exercises
def doubleAllElementsInList(in: List[Int]) = ??? // hint: use Lists map() method
def dropWhile(in: List[Int])(f: (Int) => Boolean): List[Int] = ??? // hint: use Lists filter() method
def operateOverAllElementsOfAList(in: List[Int])(f: (Int) => Double): List[Double] = ??? // hint: use Lists map() method







// FURTHER EXAMPLES - not sure what to do with these yet

def factorial(in: Int): Int = Range(1, in).toList.reduce(_ * _)

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

