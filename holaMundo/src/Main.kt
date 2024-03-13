fun main() {
    println("Hola Kotlin")

    //const myConst = 0
    val myVal = 0 //Es como usar const, no permite cambiar el valor de la constante porque es una constante

    val myList = mutableListOf("Diana", "Teresa", "Camila", "Maria") // Crea una lista de strings
    println(myList.get(1))//imprime el elemento 1 de la lista
    println(myList[1]) //lo mismo que el comando de arriba
    myList.add("César")//Es importante colocar mutable para que se pueda agregar un nuevo elemento a la lista
    println(myList)

    val mySet = setOf("Diana", "Teresa", "Camila", "Maria")
    println("Primer set " + mySet)
    val mySecondSet = setOf("Diana", "Teresa", "Camila", "Maria")
    println("Segundo set $mySecondSet")// Tambien se pueden imprimir asi cuando se concatenan datos

    val myMap = mutableMapOf("Diana" to 1, "Camila" to 2) // guarda una llave y su código
    println(myMap["Diana"]) // Imprime el valor de la llave
    myMap["Teresa"] = 3 //Se tiene que colocar mutable para poder añadir un nuevo elemento
    println("Imprime la key de Diana: " + myMap["Diana"])

    for (value in myList) { //recorre los valores de la lista de arregls declarada antes
        println(value)
    }
    var myCounter = 0 //establecemos un contador
    while (myCounter <= myList.count()) {
        println(myList)
        myCounter++
        //El contador para que se vaya sumando hasta que tenga la msimacantidad que myList
    }
    //var myVar
    /* var myOptional: string? = null
     println(myOptional)
     myOptional = "Mi cadena de texto opcional"
     println(myOptional)*/
    var favoriteActor: String? = "Sandra Oh" //es necesario colocar ? para que pueda almacenar valores null
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor) //imprime null y no muestra ningun error



}//fin



