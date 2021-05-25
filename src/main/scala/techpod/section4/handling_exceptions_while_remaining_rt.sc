// RT = Referentially Transparent

def divideBy(a: Int, b: Int): Either[Throwable, Double] = {
  try{
    Right(a/b)
  }
  catch {
    case e: Throwable => Left(e)
  }
  
}

divideBy(10, 0)


def divideBy1(a: Int, b: Int): Option[Int] = {
  try {
    Some(a/b)
  } catch {
    case e: Throwable => None
  }
}

divideBy1(10, 0)
