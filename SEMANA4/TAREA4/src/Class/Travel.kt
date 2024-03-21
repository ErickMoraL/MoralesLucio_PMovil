package org.example.Class

abstract class Travel {
    abstract val country: String
    abstract val city: String
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount:Double = 0.0

    fun reserve(numDays: Int){
        if(reserved){
            println("""¡Ya reservaste tu viaje! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
            return
        }
        val amount:Double = getPrice(numDays)
        if(amount==0.0){
            return
        }
        reserved = true
        paidAmount = amount
        println("""¡Viaje reservado exitosamente! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
    }

    protected abstract fun getPrice(numDays: Int): Double

    //abstract fun quotePrice(numDays:Int)

    fun quotePrice(numDays: Int) {
        val price:Double = getPrice(numDays)
        if(price==0.0){
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else{
            println("Tu viaje a $city cuesta \$$price")
        }
    }
}