val lowerCaseString: (String) -> String  = { text -> text.lowercase()}
val concatString: (String, String) -> String = {text, text2 -> text + text2}
val myPrint = { println("Minha mensagem")}

fun main() {

    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("joao paulo"))


    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0}
    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
    println(negatives)

    val doubled = numbers.map {x -> x * 2}
    val isTripled = {x: Int -> x * 3}

    val triple = numbers.map(isTripled)
    println("*".repeat(10))
    println(doubled)
    println(triple)

    myPrint()

    println(lowerCaseString("JOAO"))
    println(concatString("JOAO ", "Paulo"))

    myPrint()




}