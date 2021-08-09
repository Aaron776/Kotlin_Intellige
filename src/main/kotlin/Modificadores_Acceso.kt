class Modificadores_Acceso() {
    //Los modificadores de acceso van a modificar la forma en que podemos acceder a propiedas, caracteristicas, funciones o metodos de una clase
    // Los modificadores de acceso son dos: public y private
    //Pra llamar a una funcion que este con el private lo que se puede hacer es llmar a esa funcion pero dentro de una funcion que sea publica
     var precio=12
    var nombre="Juan"

    private fun despegar(){
        println("Su avion ha despegado sin turbulencias")

    }

    fun aterrizar(){
        println("Su avion aterrizo con ligeros problemas")
        despegar()

    }
}