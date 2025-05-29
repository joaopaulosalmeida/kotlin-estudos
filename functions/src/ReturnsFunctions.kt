val registeredUsernames = mutableListOf("joaopaulosto", "vanessacoa")
val registeredEmails = mutableListOf("joaopaulosto@gmail.com", "vanessa.coliveira@hotmail.com")

fun registerUser(username: String, email: String): String{

    if(username in registeredUsernames){
        return "Username already taken. Please choose a different username."
    }
    if(email in registeredEmails){
        return "Email already registered. Please use a diffeerent email"
    }

    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered sucessfully: $username"
}
fun main(){
    println(registerUser("joaopaulosto", "jpsa@gmail.cm"))
    println(registerUser("joaopaulo.almeida", "joaopaulo.almeida@yahoo.com.br"))
}