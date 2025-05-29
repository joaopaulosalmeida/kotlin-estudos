package compare

data class User(val name: String, val id: Int)

fun main(){
    val user = User("JP", 1)
    val secundUser = User("JP", 1)
    val thirdUser = User("Max", 2)

    //Compares users to secound user
    println("user == secundUser: ${user == secundUser}")

    //Compares user to third user
    println("user == thirdUser: ${user == thirdUser}")
}