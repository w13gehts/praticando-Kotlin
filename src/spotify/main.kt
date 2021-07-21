package spotify

import spotify.functions.album
import spotify.functions.track
import spotify.functions.trocaAlbum

fun main(args: Array<String>) {
    print("Qual álbum você gostaria de ouvir? ")
    var escolhaAlbum = readLine()!!
    album = escolhaAlbum

    print("Qual faixa você gostaria de ouvir? ")
    var escolhaTrack = readLine()!!.toInt()
    track = escolhaTrack

    trocaAlbum()
}