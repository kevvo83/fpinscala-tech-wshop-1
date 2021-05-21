
class UserService {

}


class UserServiceWithConstructor(connectionUrl: String) {

}

class UserServiceWithMethod {

  def authenticate(token: String): Boolean = true

}

val userService = new UserService()
val UserServiceWithConstructor =
      new UserServiceWithConstructor("jdbc:oracle:thin:@localhost:1521")
val userServiceWithMethod = new UserServiceWithMethod()

val authResult = userServiceWithMethod.authenticate("token")