package selaledClassConstructors
sealed class IOError{
    //A sealed class constructors has protecnted visibility by default.
    //It's visible inside this class and its subclass
    constructor() { /** */ }

    //Private constructor, visible inside this class only
    //Using a private constructor in a sealed class allows for even stricter control over instantiation,
    // enabling specific initialization producers within the class.
    private constructor(description: String): this (){

    }
    //this will raiser an error because public and internal constructors are not allowed in sealed classes
    //public constructor(code: Int): this(){}
}