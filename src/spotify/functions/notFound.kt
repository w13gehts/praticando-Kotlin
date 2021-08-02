package spotify.functions

import album
import year
import artista
import music
import track

fun notFound () {
    artista = "artist not found"
    album = "album not found"
    year = "year not found"
    music = "music not found"

    println("Now Listening: $track - $artista - $music ($album, $year)")
}