package org.example.Class

class Vehiculo(val marca:String, val modelo: String, var color: String){

    init{
        println("""Los datos del coche son:
        marca: $marca
        modelo: $modelo
        color: $color""")
    }

    var placas = ""
    var gasolina = 0f
    var encendido = false

    fun encender(){
        encendido=true
    }
    fun apagar(){
        encendido=false
    }
    fun recargar(litros:Float){
        gasolina+=litros
    }
}