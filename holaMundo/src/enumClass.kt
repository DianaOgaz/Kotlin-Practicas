fun main() {

    //Enum classes
    enumClass()
    //Nested and inner classes
    NestedAndInnerClass()
    //Herencia de clases
    classInheritance()
}
enum class direccion (){ //Se declara la clase para enum donde contiene las direcciones del usuario 
    Norte, Sur, Este, Oeste; //Es importante que se cierre la declaracion de enmun con ;

    fun description() : String{
        return when (this){ // se deben de tomar en cuenta todos los posibles valres 
            Norte -> "La direccion es norte"
            Sur -> "La direccion es sur"
            Este -> "La direccion es este"
            Oeste -> "La direccion es oeste"
            else -> "La direccion se encuentra" // se usa else en caso de que pueda obtener más resultados pero en este caso es innecesario
        }
    }


}
private fun enumClass(){
    var usuarioDireccion: direccion? = null //Declaramos una variable con el nombre de la clase enum en el tipado y por defecto va a estar null 
    println(usuarioDireccion)

    usuarioDireccion = direccion.Norte
    println(usuarioDireccion)

    usuarioDireccion = direccion.Sur
    println(usuarioDireccion)

    usuarioDireccion = direccion.Este
    println(usuarioDireccion)

    usuarioDireccion = direccion.Oeste
    println(usuarioDireccion)

    println(direccion.entries) //imprime todo el contenido de la clase enum

    println(usuarioDireccion.name) // Imprime el valor actual de la variable

    println(usuarioDireccion.ordinal) //Imprime el numero de la posicion del enum 

    println("El nombre del enmun: " + usuarioDireccion.name + " El numero de la posisión del enum: " + usuarioDireccion.ordinal ) //Concatenacion

    //Funciones
    println(usuarioDireccion.description())

}

private fun NestedAndInnerClass(){
//clase anidada
    val myNestedCLass = MyNestedAndInnerClass.MyNestedClass()
    val resu: Int = myNestedCLass.sum(1,2)
    println("el resultado de la suma es: $resu")
}
 private fun classInheritance(){
     val person = Person("Sara", 21)
     val programmer = Programmer("Diana", 16, language = "Kotlin")
     val desinger = Designer("Armando", 12)
     //programmer.work()
     programmer.sayLanguage()
     desinger.work()
     programmer.gotToWork()
     person.work()
     programmer.drive()
 }
