
fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Ola ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Jesus Cristo é o meu Senhor!"
    println(str[0..11])
}


