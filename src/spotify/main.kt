package spotify

import album
import track
import changeAlbum
import java.util.*

fun main(args: Array<String>) {
    print("Which album would you like to listen?")
    val chosenAlbum = readLine()!!.uppercase(Locale.getDefault())
    album = chosenAlbum

    print("Which track would you like to listen? ")
    val chooseTrack = readLine()!!.toInt()
    track = chooseTrack

    changeAlbum()
}