package zoo

// Clase abstracta base
abstract class Animal(
    val nombre: String,
    var edad: Int
) {
    init {
        println("Creando animal: $nombre")
    }

    abstract fun sonido()

    open fun info() {
        println("Soy $nombre, tengo $edad años")
    }
}