fun main(args: Array<String>) {
    //Los operadores logicos en Kotlin son los siguientes: &&(y), || (o)
    var numero:Int
    println("Ingrese un numero: ")
    numero=readLine()?.toInt() as Int
    if (numero==2 || numero>2){
        println("Correcto")
    }else{
        println("Incorrecto")
    }


    var nombre:String
    var edad:Int
    print("Ingrese su Nombre: ")
    nombre=readLine()?.toString() as String

    print("Ingrese su edad: ")
    edad=readLine()?.toInt() as Int
    if (nombre=="Aaron" && edad>=18){
        println("Eres Apto")
    }else{
        println("No eres apto")
    }
}