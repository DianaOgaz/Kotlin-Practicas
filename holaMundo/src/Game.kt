interface Game {
    val game:String
    fun play()
    fun stream(){
        println("Comenzó el stream de $game!")
    }


}