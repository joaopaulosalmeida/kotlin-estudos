fun main() {
    //Read-only set

    val readOnlySet = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlySet)
    //Mutable set with explicit type declaration
    val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruits)

    val fruitsLocked: Set<String> = fruits

    println("This set has ${readOnlySet.count()} items")

    println("banana" in readOnlySet)

    fruits.add("dragonfruit")
    println(fruits)

    fruits.remove("dragonfruit")
    println(fruits)
}