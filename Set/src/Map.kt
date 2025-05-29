fun main(){
    //Read-only map

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    //Multable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

    println(juiceMenu)

    //Add item in map
    juiceMenu["coconut"] = 150

    println(juiceMenu)

    //Remove item
    juiceMenu.remove("orange")


    println(juiceMenu)

    //locked Mutable Map
    val juiceMenuLocked: Map<String, Int> = juiceMenu


    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")


    println("The value of dragonfruit juice is: ${readOnlyJuiceMenu["dragonfruit"]}")

    println("This map has ${readOnlyJuiceMenu.count()} key-values pairs")

    println(readOnlyJuiceMenu.containsKey("kiwi"))

    println(readOnlyJuiceMenu.keys)

    println(readOnlyJuiceMenu.values)


    println("orange" in readOnlyJuiceMenu.keys)
    println("orange" in readOnlyJuiceMenu)

    println(200 in readOnlyJuiceMenu.values)



}