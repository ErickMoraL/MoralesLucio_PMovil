import org.example.Class.International
import org.example.Class.NationalLowSeason

fun main(){
    val viaje=International("Canada","Ottawa")
    val reserva=NationalLowSeason("Monterrey")

    reserva.reserve(8)
    viaje.quotePrice(5)
    viaje.quotePrice(4)
    viaje.reserve(5)
    viaje.reserve(4)
    reserva.cancelarReserva()
}
