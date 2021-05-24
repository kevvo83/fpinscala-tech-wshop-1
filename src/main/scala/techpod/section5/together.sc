
case class  User(name: String, age: Int)


trait  UserRepository {
  def find(criteria: Seq[String]): Option[User]
}

trait  TokenService {
  def validate(token: String): Boolean
}

trait  UserService {
  def authenticate(token: String): Boolean
  def getUserByToken(token: String): Option[User]
}


//Impl

class UserRepositoryImpl extends UserRepository {
  override def find(criteria: Seq[String]):  Option[User] =
    Option(User("Dummy", 2))
}

class TokenServiceImpl() extends TokenService {
  override def validate(token: String): Boolean = true
}

class UserServiceImpl(userRepository: UserRepository, tokenService: TokenService) extends UserService {
  override def authenticate(token: String): Boolean =
    tokenService.validate(token)

  override def getUserByToken(token: String): Option[User] =
    if (tokenService.validate(token))
      userRepository.find(Seq(s"token=$token"))
    else
      None

}

val token = "Ls7I25HGS6yx8022DQurCw"

val userRepository = new UserRepositoryImpl()
val tokenService = new TokenServiceImpl()
val userService = new UserServiceImpl(userRepository, tokenService)

userService.authenticate(token)