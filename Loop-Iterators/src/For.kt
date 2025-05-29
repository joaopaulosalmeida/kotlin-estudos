fun main() {
    for (number in 1..10 step  2){
        println(number)
    }

    println("*********************")

    for (word in 'a'..'z'){
        println(word)
    }
    println("*********************")
    for(word in 'z' downTo 'a'){
        println(word)
    }
}