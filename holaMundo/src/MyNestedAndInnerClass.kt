class MyNestedAndInnerClass {

    //Clase anidada es una clase contenida dentro de otra, Favorece el encapsulamiento y no puede acceder a los mienbrode la clase externa
    class MyNestedClass {
        fun sum(
            first: Int,
            second: Int
        ): Int { //Una función de retorno que realiza una suma segun los parametros colocados
            return first + second
        }
    }
}