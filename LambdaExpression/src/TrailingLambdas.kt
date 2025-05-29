fun main(){
    //the initial value is zero
    //The operations sums initial value with every item in the list cumulatively
    println(listOf(1,2,3).fold(0, {x, item -> x + item}))

    //Alternatively, in the form of a trailling lambda
    println(listOf(1,2,3).fold(0) {x, item -> x + item})
}