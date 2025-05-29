import kotlin.math.PI

fun circleArea(radius: Int): Double{
    return PI * radius * radius
}
//Exercise 2
fun circleArea2(radius: Int) = PI * radius * radius

fun main(){
    println(circleArea(2))
    println(circleArea2(2))
}