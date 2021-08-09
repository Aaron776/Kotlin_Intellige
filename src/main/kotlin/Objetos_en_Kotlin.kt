fun main(args: Array<String>){
    //Para crear un objeto de una clase se usa la funcion var como se si fuera a crear una variables y le damos su nombre, definios la clase de donde viene ese objeto y por ultimo poner su inicializacion

var ferrari:Auto=Auto()
    ferrari.encender()
    ferrari.apagar()

}
class Auto {

    var Precio = 40.23
    var Color: String = "Negro"


    //Funciones o actividades que va hacer esa clase u objeto
    fun encender() {
        println("El auto ha encendido")
    }

    fun apagar() {
        println("El auto se ha apagado")
    }
}