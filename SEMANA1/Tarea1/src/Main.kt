const val pi = 3.1416
val p1: DoubleArray = doubleArrayOf(4.0, 3.0)
val p2: DoubleArray = doubleArrayOf(-3.0, -2.0)

fun main() {
    var numero = 25.25
    println(numero::class.simpleName)

    var flotante: Float = 30.63F
    println(flotante::class.simpleName)

    println("El perímetro del círculo es ${flotante * 2 * pi}")

    val pendiente = (p2[1] - p1[1]) / (p2[0] - p1[0])
    println("La pendiente de los puntos (${p1[0]},${p1[1]}) y (${p2[0]},${p2[1]}) es igual a $pendiente")
}


