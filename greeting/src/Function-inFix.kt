fun main() {

    infix fun Int.times(str: String) = str.repeat(this)

    infix fun Int.multiplica(valor: Int) = this * valor

    println(3 multiplica 2)

    println(2 times "Bye ")

    val pair = "Ferrari" to "Katarina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "MacLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia

}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other)}
}
