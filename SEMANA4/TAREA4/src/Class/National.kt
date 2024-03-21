package org.example.Class

import org.example.Interfaces.ICancelar

open class National(override val city:String):Travel(),ICancelar {
    override val country = "Mexico"

    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristóbal de las casas" to 240,
        "San Miguel de Allende" to 320
    )

    override fun getPrice(numDays: Int): Double {
        val fee = fees[city]
        return if (fee==null) 0.0 else fee.toDouble()*numDays
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