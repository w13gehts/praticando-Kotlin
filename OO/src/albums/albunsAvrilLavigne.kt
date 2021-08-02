fun albunsAvrilLavigne() {
    val albumAvril = Album()

    albumAvril.trocaAlbum()
    albumAvril.trocaMusica()

    when (albumAvril.nome) {
        "LET GO" -> {
            albumAvril.artista = "Avril Lavigne"
            albumAvril.nome = "Let Go"
            albumAvril.ano = 2002
            albumAvril.tracks = 13

            when (albumAvril.track) {
                1 -> albumAvril.musica = "Losing Grip"
                2 -> albumAvril.musica = "Complicated"
                3 -> albumAvril.musica = "Sk8er Boi"
                4 -> albumAvril.musica = "I'm With You"
                5 -> albumAvril.musica = "Mobile"
                6 -> albumAvril.musica = "Unwanted"
                7 -> albumAvril.musica = "Tomorrow"
                8 -> albumAvril.musica = "Anything but Ordinary"
                9 -> albumAvril.musica = "Things I'll Never Say"
                10 -> albumAvril.musica = "My World"
                11 -> albumAvril.musica = "Nobody's Fool"
                12 -> albumAvril.musica = "Too Much to Ask"
                13 -> albumAvril.musica = "Naked"
                else -> {
                    return notFound()
                }
            }
        }
        "UNDER MY SKIN" -> {
            albumAvril.artista = "Avril Lavigne"
            albumAvril.nome = "Under My Skin"
            albumAvril.ano = 2004
            albumAvril.tracks = 12

            when (albumAvril.track) {
                1 -> albumAvril.musica = "Take Me Away"
                2 -> albumAvril.musica = "Together"
                3 -> albumAvril.musica = "Don't Tell Me"
                4 -> albumAvril.musica = "He Wasn't"
                5 -> albumAvril.musica = "How Does It Feel"
                6 -> albumAvril.musica = "My Happy Ending"
                7 -> albumAvril.musica = "Nobody's Home"
                8 -> albumAvril.musica = "Forgotten"
                9 -> albumAvril.musica = "Who Knows"
                10 -> albumAvril.musica = "Fall To Pieces"
                11 -> albumAvril.musica = "Freak Out"
                12 -> albumAvril.musica = "Slipped Away"
                else -> {
                    return notFound()
                }
            }
        }
    }
    println("Now Listening: ${albumAvril.track} - ${albumAvril.artista} - ${albumAvril.musica} (${albumAvril.nome}, ${albumAvril.ano})")
}


