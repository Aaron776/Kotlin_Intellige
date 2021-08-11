fun main(args:Array<String>){
    /*
    La herencia en programacion nos permite crear clases con sus atributos y metodos y nosotros podemos crear una clase extra que pueda heredar
    esos atributos y metodos de esa otra clase que hemos creado antes.

    Con la palabra open antes de una clase lo que va a permitir es heredar sus metodos y atributos para otra clase que necesite eso
     */
  var persona1:Persona=Persona("Juan",25)
    persona1.imprimiEdad()

   var programador1:Programador=Programador("Ruben",34,5000)
    programador1.imprimiEdad()
    programador1.imprimirNombre()
// Aqui se pudo ver que un objeto de mi clase programador puede heredar los atributos y funciones de la clase Persona
}

open class Persona(val nombre:String,val edad:Int){

    open fun imprimirNombre(){
        println("El nombre de la persona es: "+nombre)
    }
    open fun imprimiEdad(){
        println("La edad de la persona es: "+edad)
    }
}

class Programador(nombre:String,edad:Int,val sueldo:Int):Persona(nombre,edad){

    /*Una clase que hereda o una clase hija puede refefinir los metodos o funciones de su clase padre, para redefinir esa clase se usa la plabra override
    , pero para que podamos refefinir las funciones de la clase padre en la clase padre las funciones deben tener la palabra open caso
    caso contrario saldria un error cuando ponemos override
    * */
    override fun imprimirNombre(){
        println("El nombre del programador es: "+nombre)
    }

}