class Vehiculo(var color: String, var marca: String, var modelo: String, var placas: String,
               var encendido: Boolean=false, var gasolina: String="vacio") {

    init{
        println("Se a creado un obejto de tipo Vehiculo")
    }

    fun encender() {
        if (encendido) {
            println("El vehiculo ya se encuentra encendido")
        } else {
            encendido = true
            println("Se ha encendido el vehiculo")
        }
    }

    fun apagar() {
        if (encendido) {
            encendido = false
            println("Se ha apagado el vehiculo")
        } else {
            println("El vehiculo ya se encuentra apagado")
        }
    }

    fun recargar() {
        if (gasolina == "vacio") {
            gasolina = "Lleno"
            println("Vehiculo recargado")
        } else {
            println("El vehiculo ya se encuentra recargado")
        }
    }
}
