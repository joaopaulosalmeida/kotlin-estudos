class Contact(val id: Int, var email: String){
    fun printId(){
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "jp@gmail.com")
    println(contact)

    //Prints the value of the property: mail
    println(contact.email)

    //update the value of the property: email
    contact.email = "joaopaulosto@gmail.com"

    println(contact.email)

    contact.printId()
}