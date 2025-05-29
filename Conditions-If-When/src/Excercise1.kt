import kotlin.random.Random

fun main(){

    val firstResult = Random.nextInt(6)
    val secundtResult = Random.nextInt(6)

    if(firstResult == secundtResult){
        println("You win :)")
    }else{
        println("You lost :(")
    }


}