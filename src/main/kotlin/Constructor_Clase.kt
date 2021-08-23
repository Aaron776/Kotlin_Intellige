class Constructor_Clase(marca:String,precio:Double,color:String) {
    // Un constructor sirve para inicializar un objeto, un constructor se poner cuando se crea la clase, los contructores son los parentesis"()" y dentro de esos parentesis ponemos las propiedades que vamos a inicializar

    var Precio = precio
    var Color: String = color
    var Marca=marca


    //Funciones o actividades que va hacer esa clase u objeto
    fun encender() {
        println("El auto "+Marca+" ha encendido de buena manera")
    }

    fun apagar() {
        println("El auto de color "+Color+ " se ha apagado de buena manera")
    }
}