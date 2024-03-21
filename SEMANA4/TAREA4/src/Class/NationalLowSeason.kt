package org.example.Class

import org.example.Interfaces.IPromotion

class NationalLowSeason(city: String) : National(city), IPromotion {
    override  val discount = 10.0 //es porcentaje, o sea 10%
    override val typeDiscount = 0.0 //0 para porcentaje, 1 para cantidad
    override fun getPrice(numDays: Int): Double {
        val amount:Double = super.getPrice(numDays)
        return if (amount == 0.0) 0.0 else getDiscountPrice(amount)
    }
}