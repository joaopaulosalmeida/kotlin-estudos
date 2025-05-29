fun main(){

    val obj = "hello"

    when (obj){
        "1" -> println("One")
        "hello" -> println("Greenting")
        else -> println("Unknown")
    }


    val result = when(obj){
        "1" -> "One"
        "hello" -> "Greeting"
        else -> "Unknown"
    }
    println(result)

}