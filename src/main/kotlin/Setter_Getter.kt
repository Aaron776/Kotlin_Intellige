class Setter_Getter {

    private var velocidad:Int=0
    private var precio:Double =0.0
    private var nombre:String=""



    fun getVelocity():Int{
        return velocidad+20

    }

    fun setVelocity(velocity:Int){
        velocidad=velocity
    }

    fun setPrecio(price:Double){
        precio=price
    }

    fun getPrecio():Double{
        return precio
    }
    fun setNombre(name:String){  //dentro de los parentesis en el cosntructor ponemos una variable en donde queremos que se guarde la informacion o el dato
        // de la variable global que esta con el estado "private" para que la otra clase pueda acceder a ella
        nombre=name
    }

    fun getNombre():String{
        return nombre
    }







    //Los setters y getters se usan cuando los atributos de una clase estan en privado y ya que estos solo se usan en la clase en donde fueron declarados
     // pero para que un objeto en otra clase pueda acceder a esos atributos deben usarse los metodos setters y getters



}
