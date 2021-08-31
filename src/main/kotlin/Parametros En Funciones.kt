fun main(args:Array<String>){
    //Los parametros en las funciones son las variables que vamos a utilizar en nuestra funcion y solo seran
    //validas para esa funcion

    sumarNumeros(23,24) // si nuestra funcion tiene parametros al momento de llamarla debe poner los valores dentro de los parentesis para que la funcion funcione correctamente
}
fun sumarNumeros(numero1:Int, numero2:Int ){
    var sumar=numero1+numero2
    println("El resultado es: "+sumar)
}