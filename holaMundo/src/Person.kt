open class Person(name:String, age:Int): Work () { //El indicador open asegura que la clase pueda compartir sus atributos a otras
    open fun work(){
        println("Esta persona esta trabajando")
    }

    override fun gotToWork() {
        println("Esta persona va al trabajo")
    }

}