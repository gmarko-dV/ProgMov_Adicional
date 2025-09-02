package zoo

class Pajaro(
    nombre: String,
    edad: Int,
    var puedeVolar: Boolean = true
) : Animal(nombre, edad), Acciones {

    override fun sonido() = println("Pío pío")

    override fun comer() = println("El pájaro $nombre come semillas")

    override fun mover() {
        if (puedeVolar) println("El pájaro $nombre vuela en el cielo")
        else println("El pájaro $nombre camina porque no puede volar")
    }

    override fun info() {
        super.info()
        println("¿Puede volar? $puedeVolar")
    }
}
