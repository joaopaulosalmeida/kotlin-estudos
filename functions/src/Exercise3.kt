fun main() {

    println(intervalSeconds(1,20, 15))
    println(intervalSeconds(0,1, 25))
    println(intervalSeconds(2,0, 0))
    println(intervalSeconds(0,10, 0))
    println(intervalSeconds(1,0, 1))
    println("*".repeat(10))

    println(intervalSeconds(1,20,15))
    println(intervalSeconds(minutes =  1, seconds = 25))
    println(intervalSeconds(hours = 2))
    println(intervalSeconds(minutes = 10))
    println(intervalSeconds(hours = 1, seconds = 1))

}

fun intervalSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds