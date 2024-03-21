package org.example.Class

class Koopa:Enemy("Koopa",2){
    init {
        println("Iniciando Subclase de $name")
    }
    override fun collision(collider: String){
        when(collider){
            "Weapon" -> {
                state = "Shell"
                println("El estado es ahora $state")
            }
            "Enemy" -> changeDirection()
        }
    }
}