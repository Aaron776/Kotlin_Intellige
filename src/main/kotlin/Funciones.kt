fun main(args:Array<String>){
    // La funciones son estructuras de codigo que contienen instruccion, la estructura de una funcion en Kotlin es la siguiente:
  // primero ponemos la plabara fun luego el nombre de la funcion luego ponemos parentesis que contendran los parametros y por ultimo abrimos y cerramos llaves

    mostrarHola() // para que una funcion se pueda utilizar se le debe llamar a la funcion
    sumar()
}
fun mostrarHola(){
    println("Hola Kotlin")
}

fun sumar(){
    var numero1=23
    var numero2=2
    var sumar=numero1+numero2
    println("El resultado de la suma es: "+sumar)
}

