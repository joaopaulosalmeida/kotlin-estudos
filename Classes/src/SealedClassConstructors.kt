package selaledClassConstructors
sealed class Error(val message: String){
    class NetworkError: Error("Network failure")
    class DatabaseError: Error("Database cannot be reached")
    class UnknownError: Error("An unknown error has ocurred")
}

fun main(){
    val errors = listOf(Error.NetworkError(), Error.DatabaseError(), Error.UnknownError())
    errors.forEach { println(it.message) }
}
