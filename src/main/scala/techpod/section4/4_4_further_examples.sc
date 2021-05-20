// further example
def helloWorldWithArguments(myName: String): Unit = {
  println(s"Hello World, my name is ${myName}")
}

// Parentesis are optional
def helloWorldNoParenthesis(myName: String): Unit = println(s"Hello World!, my name is ${myName}")

// Parameters with default values
def helloWorldNamedParams(firstName: String = "Sumit", lastName: String = "Pawar"): Unit = println(s"Hello World!, my name is ${firstName} ${lastName}")
helloWorldNamedParams(lastName="Deshmukh", firstName="Shrinivas")
