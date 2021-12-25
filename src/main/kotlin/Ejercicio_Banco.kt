import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine

class Ejercicio_Banco(){
    //Para poder usar las variables globlaes en una clase sin usar el constructor es mejor igualarlas a cero
    var Opcion:Int=0
    var Cantidad:Int=0
    var Actualizar:Int=0
    var Nombre:String="Aaron Ortiz"

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