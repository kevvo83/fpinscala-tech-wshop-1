import java.util.Date

object DateOps {
  def toIso8601Format(date: Date): String = "2021/05/25 34:34:34"
}

DateOps.toIso8601Format(new Date())