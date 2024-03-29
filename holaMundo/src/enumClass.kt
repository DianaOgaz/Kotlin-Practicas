private
//typealias puede ser utilizado para tipos de dato largos, funciones y funciones en clases anidadas
typealias myMapList = MutableMap<Int, ArrayList<String>> //Se puede usar typeAlias para tipos de datos y para funciones
fun main() {

    //Enum classes
    //enumClass()

    //Nested and inner classes
    //NestedAndInnerClass()

    //Herencia de clases
    //classInheritance()

    //Interfaces
    //interfaces()

    //Visibility
    //visibilityModifiers()

    //DataClasses
    //dataClasses()

    //Type aliases
    //typeAliases()

    //Lambdas
    lambdas()
}
enum class direccion (){ //Se declara la clase para enum donde contiene las direcciones del usuario
                       //Cada enum es un objeto
    Norte, Sur, Este, Oeste; //Es importante que se cierre la declaracion de enmun con ;

    fun description() : String{
        return when (this){ // se deben de tomar en cuenta todos los posibles valores
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
private fun interfaces(){
val game = Person(name = "César", age = 24)
    game.stream()
    game.play()
}
private fun visibilityModifiers(){
    val visibility = Visibility() //Instanciar el objeto
    visibility.sayMyName()
}
private fun dataClasses(){
    val diana = Worker("Diana", 24, "Grupo Roga")
    diana.lastWork = "Cantante"

    val sara = Worker()

    //Contiene operaciones como equals y hashcode
    if (diana.equals(sara)){
        println("Son iguales")
    }else{
        println("No son iguales")
    }
    //toString que convierte el valor almacenado en un string
    //copy
    val diana2 = diana.copy(age = 23) //Realiza una copia del objeto y se puede cambiar sus parametros

    //ComponentN
    //El objeto se puede dividir en sus mismos parametros
    //Esto tambien es desestructuracion de datos
    //Se puede usar para clases y
    val (name, age) = diana
    println(name)
    println(age)
}
private var myMap: myMapList = mutableMapOf()
private fun typeAliases() {
    var myNewMap: myMapList = mutableMapOf()
    myNewMap[0] = arrayListOf("Diana", "Ogaz")
    myNewMap[1] = arrayListOf("César", "Gonzalez")
    myMap = myNewMap
}
private fun lambdas(){
    //Las lambdas son descritas como funciones que pueden funcionar dentro de otras funciones
    val myIntList = arrayListOf(0,1,2,3,4,5,6,7,8,9,10)
   val myFilterIntList = myIntList.filter {
        it >5

    }
    println(myFilterIntList)

}