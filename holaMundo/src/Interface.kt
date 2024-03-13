interface Interface {
    val game:String
    fun play()//No hace falta colocar interface a la funcion porque ya es abstracta
    fun stream(){
        println("Comenzó el stream de $game!")
    }

}