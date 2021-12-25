fun main(args: Array<String>) {
/* En kotlin para crear un arreglo podemos hacerlo de varias formas, la primera es usando el operador aarayof()
y dentro ponemos los elementos que pueden ser strings, numeros o booleanos y la otra forma es tipando el arreglo
para elque solo ingresemos elementos de un solo tipo de dato como por ejemplo que sea un arreglo solo de strings*/


    var mezcla = arrayOf(1, 2, 3, "Aaron")
    var numeros= intArrayOf(10, 11, 12)

//Para obtener un elelemtno del array lo hacemos mediante su posicion o indice mediante corchetes o tambien usando el metodo get()
    println(mezcla[0])
    println(mezcla.get(3))



// Para recorrer un arreglo podemos usar el ciclo for in donde la variable item sera la variable iteradore que recorrera el arreglo elemento po elemento que
    for (item in numeros){
        println("El valor del arreglo es: "+item)
    }


    // Si solo queremos obtner los indices usamos el metodo indices sin parentesis del
    for (item in numeros.indices){
        println("El indice es: "+item)
    }

//Para saber el tamaño del arreglo o la cantidad de elementos que tiene un arreglo usamos el metodo size()
println(mezcla.size)
}


