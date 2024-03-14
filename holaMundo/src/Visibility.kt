class Visibility {
    var name:String? = null //la variable nombre puede estar vacia
    fun sayMyName(){

        name?.let { // Se usa let en caso de que el objeto en cuestion no sea nulo
            //Let es util cuando se desea hacer operaciones donde le valor posiblemente este nulo y
            //No salga un nullPointerException
            println("Mi nombre es $it")
        }?: run{ // ejecuta un bloque de código en contexto con un objeto
            println("No tengo nombre")
        }
        // Se obtiene el mismo resultado usando este código
        if (name == null){
            println("No tengo nombre")
        }else{
            println("Mi nombre es $name")
        }
    }
/*
* Si no se coloca ningun modificador, por defecto estará en public y será visible en cualquier parte del proyecto
* Private: Solo estará visible en el fichero que contiene la declaración
* Protected: Estará visible solament epara las declaraciones de bajo nivel
*Internal: Se utiliza para que la declaracion solo sea usada dentro del modulo del proyecto
*  */

}