fun main(args: Array<String>) {
    //La Data class es una clase que nos va a permitir almacenar datos sin implmentar funcionalidades

var articulo1:Articulo=Articulo("Jabon",1,12.09)
    println(articulo1)

    //Para poder cambiar los datos de una varribales solo hace falta acceder a esa variable
    articulo1.precio=12.98
    println(articulo1)

}
data class Articulo(val name:String, val codigo:Int, var precio:Double)
