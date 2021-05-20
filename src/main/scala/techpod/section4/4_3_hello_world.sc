// first example - what follows after : is the function return type - Unit is equivalent to void
def helloWorld(): Unit = {
  println("Hello World, welcome to the ...")
}





// For Generic functions this doesn't work so well - you'll need to explicitly provide the input + output types
def op1(a: Int, b: Int, f: (Int, Int) => Int): Int = f(a, b)