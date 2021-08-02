package forLoop.functions

fun horarios () {
    var turno = ""

    for (i in 0..23) {
        turno = when (i) {
            in 6..11 -> "Manhã"
            in 12..17 -> "Tarde"
            in 18..23 -> "Noite"
            else -> "Madrugada"
        }
        println("Hora: $i, Turno: $turno")
    }
}