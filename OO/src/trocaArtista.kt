import java.util.*

fun trocaArtista() {
    println("Qual artista você gostaria de ouvir?")
    val escolhaArtista = readLine()!!.uppercase(Locale.getDefault())

    when (escolhaArtista) {
        "AVRIL LAVIGNE" -> albunsAvrilLavigne()
        "ASHNIKKO" -> albunsAshnikko()
        else -> {
            return notFound()
        }
    }
}