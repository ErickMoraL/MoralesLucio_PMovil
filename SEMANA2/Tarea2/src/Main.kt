fun main() {

    val listaNombres = listOf(
        "Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés", "Romeo",
        "Ernesto", "Juan Pedro", "Ariadna", "Mireya María", "Ana Sofía", "José Juan"
    )
    println("El área de un rectángulo de 15x20 es de ${areaRectangulo(15f, 20f)}")
    println("El volumen de un prisma rectangular de 15x25x45 es de: " +
            "${volumenPrisRectangular(areaRectangulo(15f, 25f), 45f)}")
    println("El promedio con tus calificaciones anteriores es de: ${promedioAlumnos(2f, 9f, 7f)} ")
    println("El promedio con tus calificaciones anteriores es de: ${promedioAlumnos(cal3 = 10f)} ")
    println("Un triángulo con lados de 15x10x10cm es del tipo: ${tipoTriangulo(15f, 10f, 10f)}")
    println("Un triángulo con lados de 10x10x10cm es del tipo: ${tipoTriangulo(10f, 10f, 10f)}")
    println("Un triángulo con lados de 15x18x10cm es del tipo: ${tipoTriangulo(15f, 18f, 10f)}")

    println("El dato '25.5' es un tipo de dato ${tipoDato(25.5f)}")
    println("El dato 'hola' es un tipo de dato ${tipoDato("hola")}")
    println("El numero de veces que se repite el nombre Pedro son: ${contarRepeticiones(listaNombres,"Pedro")}")
}

fun volumenPrisRectangular(superficie: Float, altura: Float): Float {
    return superficie * altura
}

fun areaRectangulo(base: Float, altura: Float): Float {
    return base * altura
}

fun promedioAlumnos(cal1: Float = 8.5f, cal2: Float = 4.8f, cal3: Float): Float {
    return (cal1 + cal2 + cal3) / 3
}

fun tipoTriangulo(lado1: Float, lado2: Float, lado3: Float): String {
    if (lado1 == lado2 && lado2 == lado3) {
        return "Equilátero"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        return "Isósceles"
    } else {
        return "Escaleno"
    }
}

fun tipoDato(dato: Any): String {
    return when (dato) {
        is String -> "String"
        is Int -> "Int"
        is Float -> "Float"
        is Double -> "Double"
        is Boolean -> "Boolean"
        else -> "Desconocido"
    }
}

fun contarRepeticiones(listaNombres: List<String>, nombreBuscado: String): Int {
    var contador = 0
    for (nombreCompleto in listaNombres) {
        val nombresSeparados = nombreCompleto.split(" ") // Separar el nombre completo en partes usando espacios en blanco como delimitador
        for (nombre in nombresSeparados) {
            if (nombre == nombreBuscado) {
                contador++
            }
        }
    }
    return contador
}



