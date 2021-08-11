fun main(args:Array<String>){
    /* Una clase abstracta al igual que una clase normal nos va a pemitir declarar y definir atributos y metodos
    la diferencia es que que las clases abstractas no van a tener implementacion( o sea que no vamos a crear objetos de esta clase

    */

    //Como se puede ver aqui solo estoy ejecutando la clase "programador" con los metodos de la clase abstracta y
    // en ningun momento ejecuto la clase abstracta llamada "persona" porque saldria un error
    val prog:programador=programador("Aaron",5000)
    prog.saludar()
    prog.imprimirNombre()
}
/*Esta clase nos va a pemitir heredarla otra clase para que pueda implementar los metodos que esta va a definir
y pueda sobreescribir los metodos abstractos que van a funionar como una plantilla para la clase que vaya a implementar esta clase abstracta
* */
abstract class persona(val nombre:String){
    abstract fun saludar()

    fun imprimirNombre(){
        println("El nombre es ${nombre}")
    }

}
class programador(nombre: String,val sueldo:Int):persona(nombre){

    //Para usar o modificar una funcion o metodo de la clase abstracta debo poner la palabra override en la otra clase
    override fun saludar() {
        println("El programador esta saludando")
    }

}