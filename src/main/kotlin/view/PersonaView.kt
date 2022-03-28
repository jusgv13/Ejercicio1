package view
import controller.PersonaController
import model.Persona

class PersonaView {


    var PC = PersonaController()

    fun interaccion(){

        var P1 = Persona()
        var P2 = Persona("", 0, 0, "", 00.0f, 1.85f)
        var P3 = Persona("Justin", 22, 208000994, "M", 60.0f, 1.70f)


        //Pruebas con la Persona #1

        println("Ingrese su Nombre: ")
        P1.nombre = readLine()?.toString()!!

        println("Ingrese su Edad: ")
        P1.edad= readLine()?.toInt()!!

        println("Ingrese su Cedula: ")
        P1.cedula = readLine()?.toInt()!!

        println("Ingrese su Sexo (M/H): ")
        P1.sexo = readLine()?.toString()!!

        println("Ingrese su Peso: ")
        P1.peso = readLine()?.toFloat()!!

        println("Ingrese su Altura: ")
        P1.altura = readLine()?.toFloat()!!

        println("-------------------------------------------")


        println(PC.esMayorDeEdad(P1.edad))
        println(PC.comprobarSexo(P1.sexo))
        println(PC.calcularIMC(P1.peso, P1.altura))

        PC.toString(P1.nombre, P1.edad, P1.cedula, P1.sexo, P1.peso, P1.altura)

        /*----------------------------------------------------------------------------------------*/

        //Pruebas con la Persona #2

        P2.nombre = readLine()?.toString()!!

        println("Ingrese su Edad: ")
        P2.edad= readLine()?.toInt()!!

        println("Ingrese su Cedula: ")
        P2.cedula = readLine()?.toInt()!!

        println("Ingrese su Sexo (M/H): ")
        P2.sexo = readLine()?.toString()!!

        println(PC.esMayorDeEdad(P2.edad))
        println(PC.comprobarSexo(P2.sexo))
        println(PC.calcularIMC(P2.peso, P2.altura))

        PC.toString(P2.nombre, P2.edad, P2.cedula, P2.sexo, P2.peso, P2.altura)

        /*----------------------------------------------------------------------------------------*/

        //Pruebas con la Persona #3

        println(PC.esMayorDeEdad(P3.edad))
        println(PC.comprobarSexo(P3.sexo))
        println(PC.calcularIMC(P3.peso, P3.altura))

        PC.toString(P3.nombre, P3.edad, P3.cedula, P3.sexo, P3.peso, P3.altura)
    }

}

