// Example: Using a named function with a collection method - plus different ways of expressing this
val doubleANumber = (in: Int) => in * 2
List(1, 2, 3).map(doubleANumber)
List(1, 2, 3).map(doubleANumber(_)) // _ is a placeholder character - in this case, it means each element in the list
List(1, 2, 3).map(x => doubleANumber(x))

