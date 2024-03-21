package org.example.Class

class Mario(var vidas: Int =3){ //vamos a dejar setear el número de vidas al iniciar el objeto Mario

    init {
        println("It's a me! Mario!") //vamos a hacer que Mario se presente al construirlo!
    }

    private var state = "small" //mario es pequeño al iniciar el juego
    //private var lives = 3 //uno empieza el juego con tres vidas

    //resta una vida al jugador
    private fun die(){
        vidas--
        println("Has perdido una vida!")
    }

    //el modificador public es redundante
    //en función del objeto colisionante, se ejecuta un evento
    fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> die()
            "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido ¡no pasa nada!")
        }
    }
}