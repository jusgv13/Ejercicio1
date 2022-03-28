package model

open class Persona {

    var nombre : String = ""
    var edad : Int = 0
    var cedula : Int = 0
    var sexo : String = ""
    var peso : Float = 0.0f
    var altura : Float = 0.0f

        get() = field // getter
        set(value) { field = value }// setter

    //Variables para el Peso
    val pesoBajo : Int = -1
    val pesoArriba : Int = 1
    val pesoSano : Int = 0

    //Variable para el Sexo

    val sexoDefinido : String = "H"


    //Constructor por Defecto
    constructor(){
        var nombre : String = ""
        var edad : Int = 0
        var cedula : Int = 0
        var sexo : String = ""
        var peso : Float = 0.0f
        var altura : Float = 0.0f
    }

    //Constructor con el nombre, edad y sexo, el resto por defecto.
    constructor(nombre: String, edad: Int, sexo: String) {
        this.nombre = ""
        this.edad = 0
        this.sexo = ""
    }

    //Constructor con todos los atributos como parámetro.
    constructor(nombre: String, edad: Int, cedula: Int, sexo: String, peso: Float, altura: Float) {
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

}