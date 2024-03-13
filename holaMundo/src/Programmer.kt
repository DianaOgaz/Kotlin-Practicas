class Programmer(name:String, age:Int):Person(name, age) { //Se debe de colocar los parametros del constructor y los parametros que heredará la clase actual
 override fun work(){ //para poder utilizar las funciones de la clase padre, tambien se debe colocar open el la clase padre y para utilizarlo en la clase hijo se debe colocar overwrite
  println("Esta persona esta programando")
  super.work() //super es la referencia a la clase padre
}
}