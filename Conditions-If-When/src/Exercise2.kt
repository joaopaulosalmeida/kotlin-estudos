fun main(){
    val button = "A"

    println(when(button){
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nohtin"
        else -> "There is no such button"
    })
}