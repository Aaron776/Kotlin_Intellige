fun main(args: Array<String>) {
    //Los setters y getters tiene que ver con el encapsulamiento ccuando tenemos funciones o propiedades con private
    // y atravaes de estos setters y getters vamos a poder obtner esas funciones o propiedades
    var accion: Setter_Getter = Setter_Getter()
    accion.setVelocity(20)
    println(accion.getVelocity())
}
