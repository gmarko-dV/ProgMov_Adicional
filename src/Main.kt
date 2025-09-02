package zoo

fun main() {
    val leon1 = Leon(nombre = "Simba", edad = 5)
    leon1.info()
    leon1.sonido()
    leon1.comer()
    leon1.mover()

    println()

    val pajaro1 = Pajaro(nombre = "Tweety", edad = 2, puedeVolar = false)
    pajaro1.info()
    pajaro1.sonido()
    pajaro1.comer()
    pajaro1.mover()

    println()

    val leon2 = Leon(nombre = "Mufasa", edad = 8, melena = false)
    leon2.info()
    leon2.sonido()
}
