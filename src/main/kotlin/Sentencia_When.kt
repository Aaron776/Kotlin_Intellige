fun main(args:Array<String>){
    var numero:Int
    println("Ingrese un numero")
    numero= readLine()?.toInt() as Int
    when(numero){
        1 ->{ println("El numero es 1")

        }
        2 ->{
            println("El numero es 2")
        }

        3 ->{
            println("El numero es 3")
        }
        else ->{
            println("No esta permitido este numero")
        }

    }

}