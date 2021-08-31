fun main(args: Array<String>){
    var numero=0 // en los ciclos es recomandabale tener una variable iteradora que inicie en cero para que el bucle no se vuelva infinito

    // este ciclo do while a diferencia del while primero ejecuta la operacion y luego pasa a evaluar si cumple o no dentro del ciclo sin imortar si esta equivocada
    do {
        println("Hola Mundo")
        numero++
    }while (numero<=6)

}