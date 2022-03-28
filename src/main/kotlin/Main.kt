import controller.PersonaController
import model.Persona
import view.PersonaView

fun main(args: Array<String>) {

    var Persona1 = PersonaView()

    Persona1.interaccion()

    println("Program arguments: ${args.joinToString()}")
}