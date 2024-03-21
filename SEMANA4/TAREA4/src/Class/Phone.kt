package org.example.Class

class Phone {
    //Atributos
    init{
        println("Telefono Creado")
    }
    var isOn = false
    lateinit var model:String
    companion object Factory {
        fun create(): Phone = Phone()
    }
    //Métodos
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun getTurn(){
        val turnMode = if(isOn) "Encendido" else "Apagado"
        println("El teléfono esta $turnMode")
    }
}