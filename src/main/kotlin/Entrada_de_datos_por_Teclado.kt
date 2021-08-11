fun main(args: Array<String>){
  //la funcion readline no permite ingresar cualquier dato por  medio de la consola
    println("Ingrese un Primer Numero")
    var numero1= readLine()?.toInt() as Int

    println("Ingrese un Segundo Numero")

    var numero2= readLine()?.toDouble() as Double

    var suma=numero1 + numero2
    println("La suma es : " +suma)

    if (suma>7){
       println("Su numero es mayor a 7")
    }else{
        println("Su numero no sirve")
    }

}