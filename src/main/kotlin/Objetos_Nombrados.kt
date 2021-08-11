fun main(arg:Array<String>){
/*
Crear asi los obejtos no facilita para no crear o definir una clase, solo creamos el objeto
Los objetos nombrados se puede crear en que parte del codigo de una clase o una funcion main y esta va a funcionar como una mini clase
*/
    println(Avion.marca)
    Avion.despegar()
}
 object Avion{
  // aqui van los atributos y metodos de ese objeto
     var precio:Double=0.0
     var marca:String="Chevrolet"

     fun despegar(){
         println("Esre avion ya despego")
     }

 }

