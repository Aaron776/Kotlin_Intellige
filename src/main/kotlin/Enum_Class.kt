fun main(args: Array<String>) {
    // La Enum Class sirve para declarar un conjunto de constantes
var articulo2:articulo=articulo("Jamon",1,Precio.Barato)
    println(articulo2)
    articulo2.precio=Precio.Justo
    println(articulo2)
}
data class articulo(val name:String, val codigo:Int, var precio:Precio)

enum class Precio{
    Caro,
    Barato,     //Estas son las constantes
    Justo
}