package copyinstance

data class User(val name: String, val id: Int)

fun main(){
    val user = User("Alex", 1)

    //Creates an exact copy of user
    println(user.copy())

    //Create a copy of user witch name: "Max"
    println(user.copy("Max"))

    //Creates a copy of user with id: 3
    println(user.copy(id = 3))
}