fun main() {
    //Read only list

    var readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The last item in the list is: ${readOnlyShapes.last()}")

    println("The list has: ${readOnlyShapes.count()} items")

    println("circle" in readOnlyShapes)

    //Mutable list with explicit type declarationv
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    shapes.add("pentagon")

    println(shapes)

    shapes.remove("pentagon")

    println(shapes)

    //val shapesLocked: List<String> = shapes
}