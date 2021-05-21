case class Animal(name: String, age: Int)

val cat = Animal("Cat", 2)
val cat2 = Animal.apply("Cat", 2)

val isCat = cat match {
  case Animal("Cat", _) => true
  case _ => false
}

cat == cat2




