package zoo

class Leon(
    nombre: String,
    edad: Int,
    var melena: Boolean = true
) : Animal(nombre, edad), Acciones {

    override fun sonido() = println("Rugir fuerte")

    override fun comer() = println("El león $nombre caza carne")

    override fun mover() = println("El león $nombre corre por la sabana")

    override fun info() {
        super.info()
        println("¿Tiene melena? $melena")
    }
}
