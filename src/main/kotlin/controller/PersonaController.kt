package controller

import model.Persona
import kotlin.math.pow

//El controlador lleva los metodos de Persona

class PersonaController : Persona() {

    //Calculara si la persona esta en su peso ideal
    fun calcularIMC(peso: Float, altura: Float): Int {

    var pesoIdeal : Float
    pesoIdeal = peso/(altura.pow(2))

    if(peso == pesoIdeal){
    return pesoSano
    }else if(peso<pesoIdeal){
        return pesoBajo
    }else{
        return pesoArriba
    }
    }

    //Indica si es mayor de edad, devuelve un booleano
    fun esMayorDeEdad(edad: Int):Boolean{
        if(edad>17){
            return true
        }else{
            return false
        }
    }

    fun comprobarSexo(sexo:String): String {
    if(sexo == "H" || sexo == "M"){
            return "Sexo Ingresado Aceptado"
        }else{
        sexo == sexoDefinido
        return sexo
    }
    }

    fun toString(nombre: String, edad: Int, cedula: Int, sexo: String, peso: Float, altura: Float){
        println( "Los datos de la persona son: " +
                "$nombre" + " " +
                "$edad" + " " +
                "$cedula" + " " +
                "$sexo" + " " +
                "$peso" + " " +
                "$altura")
    }


}