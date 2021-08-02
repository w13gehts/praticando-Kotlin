fun albunsAshnikko() {
    val albumAshnikko = Album()

    albumAshnikko.trocaAlbum()
    albumAshnikko.trocaMusica()

    when (albumAshnikko.nome) {
        "NO BRAINER" -> {
            albumAshnikko.artista = "Ashnikko"
            albumAshnikko.nome = "No Brainer"
            albumAshnikko.ano = 2018
            albumAshnikko.tracks = 4

            when (albumAshnikko.track) {
                1 -> albumAshnikko.musica = "Blow"
                2 -> albumAshnikko.musica = "Nice Girl"
                3 -> albumAshnikko.musica = "Invitation"
                4 -> albumAshnikko.musica = "No Brainer"
                else -> {
                    return notFound()
                }
            }
        }
        "HI, IT'S ME" -> {
            albumAshnikko.artista = "Ashnikko"
            albumAshnikko.nome = "Hi, It's Me!"
            albumAshnikko.ano = 2019
            albumAshnikko.tracks = 5

            when (albumAshnikko.track) {
                1 -> albumAshnikko.musica = "Hi, It's Me"
                2 -> albumAshnikko.musica = "Special"
                3 -> albumAshnikko.musica = "STUPID"
                4 -> albumAshnikko.musica = "Working Bitch"
                5 -> albumAshnikko.musica = "Manners"
                else -> {
                    return notFound()
                }
            }
        }
    }
    println("Now Listening: ${albumAshnikko.track} - ${albumAshnikko.artista} - ${albumAshnikko.musica} (${albumAshnikko.nome}, ${albumAshnikko.ano})")
}


