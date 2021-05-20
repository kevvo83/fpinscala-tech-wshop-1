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