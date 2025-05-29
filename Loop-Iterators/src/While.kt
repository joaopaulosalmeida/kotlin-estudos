fun main(){
    var cakesEaten = 0
    var cakesBeked = 0
    while(cakesEaten < 3){
        println("Eat a cake")
        cakesEaten++
    }
    println("*".repeat(10))

    do {
        println("Bake a cake")
        cakesBeked++
    }while (cakesBeked < cakesEaten)


}