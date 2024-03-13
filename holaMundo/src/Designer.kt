class Designer(name:String, age:Int):Person(name, age) { //Se debe de colocar los parametros del constructor y los parametros que heredará la clase actual
    override fun work() {
        println("Esta persona esta diseñando")
        super.work()
    }

}