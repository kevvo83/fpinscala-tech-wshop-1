import java.util.Date

//OPP
class Person(name: String,  birthDate: Date) {
  def getAge = new Date().getTime - birthDate.getTime //for illustration only
}


//SRP