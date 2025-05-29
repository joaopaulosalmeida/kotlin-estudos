fun main(){
    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for(word in words){
        if(word.uppercase().startsWith("L")){
            println(word)
        }
    }
}