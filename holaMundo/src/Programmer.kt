class Programmer(name:String, age:Int, val language: String):Person(name, age), Vehicle{ //Se debe de colocar los parametros del constructor y los parametros que heredará la clase actual
 override fun work(){ //para poder utilizar las funciones de la clase padre, tambien se debe colocar open el la clase padre y para utilizarlo en la clase hijo se debe colocar overwrite
  println("Esta persona esta programando")
  super.work() //super es la referencia a la clase padre
}
 fun sayLanguage(){
  println("El lenguaje del programador es $language")
 }

 override fun gotToWork() {
  println("Esta persona va a Google")
 }
 override fun drive(){
println("Esta persona conduce un coche")
 }
}