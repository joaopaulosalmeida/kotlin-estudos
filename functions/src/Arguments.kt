fun printMessageWithPrefix(message: String, prefix: String){
    println("[$prefix] $message")
}

fun main() {

    //uses named arguments with swapped paraeter orders
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    //[Log] Hello

}
