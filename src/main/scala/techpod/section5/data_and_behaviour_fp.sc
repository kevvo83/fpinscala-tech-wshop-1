import java.util.Date

case class Person(name: String,  birthDate: Date)


class PersonService {
  def age(person: Person): Int =
    new Date().getYear- person.birthDate.getYear  //for illustration only
}