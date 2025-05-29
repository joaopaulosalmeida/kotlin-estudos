package destructuring

data class User(val name: String, val id: Int)

fun main(){
    val jane = User("Jane", 35)
    val (name, age) = jane

    println("$name, $age years of age")
}