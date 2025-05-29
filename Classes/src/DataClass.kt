package dataclass

data class User(val name: String, val id: Int)

fun main(){
    val user = User("Joao Paulo", 1)
    //Automatically uses toString) function so that output is wasy to read
    println(user)
}