package org.example.Class

import org.example.Interfaces.ICancelar

class International (override val country: String, override val city: String): Travel(),ICancelar {
    protected val destination = mapOf(
        "Alemania" to mapOf(

            "Munich" to 980,
            "Berlin" to 820,
            "Francort" to 850
        ),
        "Chile" to mapOf(
            "Santiago" to 643,
            "Valparaiso" to 721
        ),
        "Canada" to mapOf(
            "Vancouver" to 620,
            "Ottawa" to 680,
            "Montreal" to 600
        )
    )




    override fun getPrice(numDays: Int):Double {
        val fee = destination[country]?.get(city)?: 0
        val impuesto:Double = when (country) {
            "Alemania" -> 1.16
            "Chile" -> 1.05
            "Canada" -> 1.10
            else -> 1.0 // Valor predeterminado si el país no está especificado
        }

        return fee.toDouble() * numDays.toDouble() * impuesto

    }

    override fun cancelarReserva() {
        if (!reserved) {
            println("No hay ninguna reserva para cancelar.")
        } else {
            reserved = false
            paidAmount = 0.0
            println("La reserva para el viaje a $city ha sido cancelada.")
        }
    }



}