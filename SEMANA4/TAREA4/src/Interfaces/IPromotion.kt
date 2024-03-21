package org.example.Interfaces

interface IPromotion {
    val discount: Double // el descuento en porcentaje o en cantidad
    val typeDiscount: Double // porcentaje (0) o cantidad (1)

    fun getDiscountPrice(amount: Double): Double { // obtener el precio real ya con el descuento
        return if (typeDiscount == 0.0) { // 0 es porcentaje
            amount * (1.0 - discount / 100.0) // Calcular el precio con el descuento porcentual
        } else { // cantidad específica
            amount - discount // Restar la cantidad específica del precio
        }
    }
}