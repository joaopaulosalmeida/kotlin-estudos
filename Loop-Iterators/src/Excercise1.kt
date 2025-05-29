fun main(){
    var pizzaSlice = 1
    while(pizzaSlice < 8){
        println("There's only $pizzaSlice slice/s of pizza")
        pizzaSlice++
    }
    println("There are  $pizzaSlice slices of pizza. Hooray! We have a whole pizza! :D")

    println("*".repeat(10))

    pizzaSlice = 1
    do{
        println("There's only $pizzaSlice slice/s of pizza")
        pizzaSlice++
    }while (pizzaSlice < 8)
    println("There are  $pizzaSlice slices of pizza. Hooray! We have a whole pizza! :D")

}