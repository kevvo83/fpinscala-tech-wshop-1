
val ls = List(1,2,3,4)

def sum(ls: List[Int]): Int = {
  var x = 0
  for(e <- ls) {
    x = x + e
  }
  x
}

sum(ls)

def sum2(ls: List[Int]): Int = ls.foldLeft(0){(a,e) => a+e}

sum2(ls)

def sum3(ls: List[Int]): Int = ls match {
  case Nil => 0
  case head :: tail => head + sum2(tail)
}

sum3(ls)
