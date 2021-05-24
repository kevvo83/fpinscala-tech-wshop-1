

case class  User(name: String, age: Int)

trait  UserRepository {
  def find(criteria: Seq[String]): Option[User]
}


trait  UserRepositoryWithConcreteMethods {

  def find(criteria: Seq[String]): Option[User] =
    all(criteria, 1, 0).headOption

  def all(criteria: Seq[String], limit: Int, offset: Int): Seq[User]

}


class DummyUserRepository extends UserRepository {
  override def find(criteria: Seq[String]): Option[User] = Option(User("Dummy", 0))
}

class DummyUserRepositoryWithConcreteMethods extends UserRepositoryWithConcreteMethods {
  override def all(criteria: Seq[String], limit: Int, offset: Int): Seq[User] = Seq(
    User("Dummy", 0)
  )
}

val userRepository = new DummyUserRepository()
userRepository.find(Seq.empty[String])

val userRepositoryWithConcreteMethods = new DummyUserRepositoryWithConcreteMethods()
userRepositoryWithConcreteMethods.find(Seq.empty[String])