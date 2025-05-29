fun main(){

    val trafficLigthState = "Red"

    var trafficAction = when {
        trafficLigthState == "Green" -> "Go"
        trafficLigthState == "Yellow" -> "Slow down"
        trafficLigthState == "Red" -> "Stop"
        else -> "MalFunction"
    }
    println(trafficAction)
}