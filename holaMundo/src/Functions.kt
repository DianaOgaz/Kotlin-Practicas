fun main() {
    sayHi("k onda ese")
    val myClass = MyClass("Diana", "Ogaz")
    println("El nombre es: " + myClass.name + " El apellido es: " + myClass.lastname)
}

fun sayHi(message: String) {
    println(message)

}

class MyClass(var name: String, var lastname: String) { //el contructor va directamente en la clase

}


