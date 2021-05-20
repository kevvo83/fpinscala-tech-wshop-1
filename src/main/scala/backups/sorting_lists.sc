// Simple examples
val in: List[Int] = List(2, 4, 0, 9, 1, 8, 2, 5)

in.sorted
in.sorted.reverse == in.sortWith(_ > _)



// What happens if you have Data Objects that you want to sort by a particular field?
case class Transaction(item: String, price: Double)

val listOfTxns: Seq[Transaction] = Seq(
  Transaction("soap", 20.0),
  Transaction("clearer", 10.0),
  Transaction("toothbrush", 22.1),
  Transaction("bathroom cleaner", 12.1),
  Transaction("mouthwash", 28.1),
  Transaction("shoes ", 51.2),
  Transaction("undies", 20.5),
  Transaction("socks", 10.5)
)

listOfTxns.sortWith(_.price > _.price)
listOfTxns.sortWith(_.price < _.price)

// You will also see the use of the Ordering trait
import scala.math.Ordering
implicit val txnOrderingByPrice: Ordering[Transaction] = Ordering.by[Transaction, Double](_.price)

listOfTxns.sorted