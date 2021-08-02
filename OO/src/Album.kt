import java.util.*

class Album {
    var artista = ""
    var nome = ""
    var musica = ""
    var tracks = 0
    var track = 0
    var ano = 0

    fun trocaAlbum() {
        println("Qual álbum você gostaria de ouvir?")
        val escolhaAlbum = readLine()!!.uppercase(Locale.getDefault())
        nome = escolhaAlbum
    }

    fun trocaMusica() {
        println("Qual track do álbum você gostaria de ouvir?")
        val track = readLine()!!.toInt()
        this.track = track
    }
}