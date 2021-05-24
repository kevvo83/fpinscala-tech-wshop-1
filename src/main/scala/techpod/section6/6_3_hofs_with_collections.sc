// Example: Using a named function with a collection method - plus different ways of expressing this
val doubleANumber = (in: Int) => in * 2
List(1, 2, 3).map(doubleANumber)
List(1, 2, 3).map(doubleANumber(_)) // _ is a placeholder character - in this case, it means each element in the list
List(1, 2, 3).map(x => doubleANumber(x))


// Example: List of daily temperatures in Degree Celcius
val listOfTempsInDegC: List[Double] = List(23.1, 31.2, 18.2, 22.3, 23.2, 19,2, 20.1)

val listOfTempsInDegF: List[Double] = listOfTempsInDegC.map(_ * 9/5 + 32)
listOfTempsInDegC.map(element => element * 9/5 + 32)




// Example: List of sales numbers
val listOfSalesByNumbers: List[Double] = List(20.0, 30.0, 12.0, 34.0, 100.2, 23.4, 22.1)

// Get sum of the above
val totalSales = listOfSalesByNumbers.foldLeft(0.0)((accumulator, element) => accumulator + element)
listOfSalesByNumbers.foldLeft(0.0)(_ + _)
listOfSalesByNumbers.reduce(_ + _)
listOfSalesByNumbers.foldRight(0.0)(_ + _) // foldRight == foldLeft only if the function is associative
listOfSalesByNumbers.sum


// Understanding flatMap
// flatMap = map + flatten





// Example: List of sales by region
val salesPerRegion: List[(String, String, Int)] = List(
  ("Singapore","Asia",100),
  ("USA","North America",20000),
  ("India","Asia",230),
  ("Brazil","South America",340),
  ("France","Europe",20000),
  ("Turkey","Europe",400),
  ("South Africa","Africa",240))

// Total sales for the organization
val totalSales = salesPerRegion.foldLeft(0)(_ + _._3)

// Filter sales by continent
val europeanSales = salesPerRegion.filter(_._2 == "Europe")
val asianSales = salesPerRegion.filter(_._2 == "Asia")

// Group by Continent
val salesPerContinent = salesPerRegion.groupBy(_._2) // HashMap - scala.collection.immutable.Map

// Get the total sales per continent
val totalSalesPerContinent = salesPerContinent.map(_ match {
  case (continent, salesInfo) => (continent, salesInfo.foldLeft(0)(_ + _._3))
}).toSeq



// Example: List of Documents vs. Tokens
val documents = List(
  (1, List("A", "B", "C", "D")),
  (2, List("A", "B", "E", "F", "G")),
  (3, List("E", "G", "H")),
  (4, List("A", "L", "M", "N"))
)

// List those documents that have more than 2 tokens
val docsThatHaveMoreThan2Tokens = documents.filter(_._2.length > 2)

// List those documents that have the tokens "E" and "M" in them
val docsThatHaveTokensEAndM = documents.filter(docDef => docDef._2.contains("E") || docDef._2.contains("M"))

// Produce a List of Tuples, that shows which Documents each Token (i.e. "A" to "H") appears in
val reverseIndexTuples = documents.flatMap(docDef => docDef._2.map((docDef._1, _)))

// documents.map(docDef => (docDef._1, docDef._2.map()))



// Example: Common practical use of the above - using Case classes to model each row of the List
case class Documents (id: Int, listOfTokens: List[String])
val documentsUsingCaseClasses = documents.map(e => Documents(e._1,e._2))

val docsThatHaveMoreThan2Tokens_1 = documentsUsingCaseClasses.filter(_.listOfTokens.length > 2)
//