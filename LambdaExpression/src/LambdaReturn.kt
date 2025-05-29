fun toSecunds(time: String): (Int) -> Int =
    when (time) {
        "hour" -> { value -> value * 60 * 60}
        "minute" -> { value -> value * 60}
        "secund" -> { value -> value }
        else -> { value -> value}
}

fun main (){
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSecunds("minute")
    val totalTimeInSecunds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSecunds secs")
}
