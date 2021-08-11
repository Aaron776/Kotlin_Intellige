class Ejercicio_Banco(opcion:Int,cantidad:Int, actualizar:Int){
    var Opcion:Int=opcion
    var Cantidad:Int=cantidad
    var Actualizar:Int=actualizar

    fun operacion(){
        println("Ingrese la accion que desea hacer")
        Opcion= readLine()?.toInt() as Int
    }

    fun acciones(){
        when(Opcion){
            1 -> {
                println("Digite la cantidad que desea Depositar")
                Cantidad= readLine()?.toInt() as Int
                Actualizar=1000+Cantidad
                println("Su saldo actual es: "+Actualizar)
            }

            2 ->{
                println("Digite la cantidad que desea Retirar")
                Cantidad= readLine()?.toInt() as Int
                if (Cantidad>1000|| Cantidad<=0){
                    println("No puede realizar esta operacion")

                }else{
                    Actualizar=1000-Cantidad
                    println("Su saldo actual es: "+Actualizar)

                }

            }
            3 ->{
                println("Gracias por Venir")
            }
            else -> println("Vuelva a intentar")
        }

    }






}