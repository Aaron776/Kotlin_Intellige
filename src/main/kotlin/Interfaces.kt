fun main(args:Array<String>){
    /*
    La interfaces son clases abstractas pero va a tener algunas diferencias, la interfaz no van a encapsular datos y estas
    solamente van a definir los metodos que vamos a implementar en las clases que tengamos, las interfaces no van a implementar metodos
    ni constructores
    */
 var estudiante1:estudiante=estudiante("Jose",3000)
 estudiante1.saludar()
    estudiante1.imprimirNombre()

}
interface sujeto{
    fun saludar()
    fun imprimirNombre()
//Una interface solo nos va a pemitir definir los metodos pero no permite implementarlos, ademas no podemos crear obejtos de una interface
}

class estudiante(nombre:String,sueldo:Int):sujeto{
     override fun saludar(){
      println("El estudiante esta saludando")
     }
     override fun imprimirNombre(){
         println("El nombre del estudiante es variado")

     }

}