import spotify.functions.notFound

var artista = "Avril Lavigne"
var album = ""
var year = ""
var track = 0
var music = ""

fun changeAlbum() {

    if (artista == "Avril Lavigne") {
        when (album) {
            "BSIDES" -> {
                album = "B-Sides"
                year = "2001"

                music = when (track) {
                    1 -> "I Don't Give"
                    2 -> "Why"
                    3 -> "Get Over It"
                    4 -> "Take Me Away"
                    5 -> "Headset"
                    6 -> "Falling Into History"
                    7 -> "Falling Down"
                    8 -> "Tomorrow You Didn't"
                    9 -> "Things I 'll Never Say"
                    10 -> "All You Will Never Know"
                    11 -> "Once And For Real"
                    12 -> "Make Up"
                    13 -> "Not The Only One"
                    14 -> "Stay(Be The One)"
                    15 -> "Move Your Little Self On"
                    16 -> "You Never Satisfy Me"
                    17 -> "Let Go"
                    else -> {
                        return notFound()
                    }
                }
            }
            "LET GO" -> {
                album = "Let Go"
                year = "2002"

                music = when (track) {
                    1 -> "Losing Grip"
                    2 -> "Complicated"
                    3 -> "Sk8er Boi"
                    4 -> "I'm With You"
                    5 -> "Mobile"
                    6 -> "Unwanted"
                    7 -> "Tomorrow"
                    8 -> "Anything But Ordinary"
                    9 -> "Things I'll Never Say"
                    10 -> "My World"
                    11 -> "Nobody's Fool"
                    12 -> "Too Much to Ask"
                    13 -> "Naked"
                    else -> {
                        return notFound()
                    }
                }
            }
            "MY WORLD" -> {
                album = "My World"
                year = "2003"

                music = when (track) {
                    1 -> "Fuel (Cover)"
                    2 -> "Basketcase (Cover)"
                    3 -> "Unwanted (Live)"
                    4 -> "Sk8er Boi (Live)"
                    5 -> "Knockin' On Heaven's Door (Cover)"
                    6 -> "Why (Live)"
                    else -> {
                        return notFound()
                    }
                }
            }
            "UNDER MY SKIN" -> {
                album = "Under My Skin"
                year = "2004"

                music = when (track) {
                    1 -> "Take Me Away"
                    2 -> "Together"
                    3 -> "Don't Tell Me"
                    4 -> "He Wasn't"
                    5 -> "How Does It Feel"
                    6 -> "My Happy Ending"
                    7 -> "Nobody's Home"
                    8 -> "Forgotten"
                    9 -> "Who Knows"
                    10 -> "Fall To Pieces"
                    11 -> "Freak Out"
                    12 -> "Slipped Away"
                    else -> {
                        return notFound()
                    }
                }
            }
            "THE BEST DAMN THING" -> {
                album = "The Best Damn Thing"
                year = "2007"

                music = when (track) {
                    1 -> "Girlfriend"
                    2 -> "I Can Do Better"
                    3 -> "Runaway"
                    4 -> "The Best Damn Thing"
                    5 -> "When You're Gone"
                    6 -> "Everything Back But You"
                    7 -> "Hot"
                    8 -> "Innocence"
                    9 -> "I Don't Have To Try"
                    10 -> "One Of Those Girls"
                    11 -> "Contagious"
                    12 -> "Keep Holding On"
                    else -> {
                        return notFound()
                    }
                }
            }
            "GOODBYE LULLABY" -> {
                album = "Goodbye Lullaby"
                year = "2011"

                music = when (track) {
                    1 -> "Black Star"
                    2 -> "What The Hell"
                    3 -> "Push"
                    4 -> "Wish You Were Here"
                    5 -> "Smile"
                    6 -> "Stop Standing There"
                    7 -> "I Love You"
                    8 -> "Everybody Hurts"
                    9 -> "Not Enough"
                    10 -> "4Real"
                    11 -> "Darlin"
                    12 -> "Alice"
                    13 -> "Remember When"
                    14 -> "Goodbye"
                    else -> {
                        return notFound()
                    }
                }
            }
            "AVRIL LAVIGNE" -> {
                album = "Avril Lavigne"
                year = "2013"

                music = when (track) {
                    1 -> "Rock'n'roll"
                    2 -> "Here's To Never Growing Up"
                    3 -> "17"
                    4 -> "Bitchin' Summer"
                    5 -> "Let Me Go"
                    6 -> "Give You What You Like"
                    7 -> "Bad Girl"
                    8 -> "Hello Kitty"
                    9 -> "You Ain't Seen Nothin' Yet"
                    10 -> "Sippin' On Sunshine"
                    11 -> "Hello Heartache"
                    12 -> "Falling Fast"
                    13 -> "Hush Hush"
                    else -> {
                        return notFound()
                    }
                }
            }
            "HEAD ABOVE WATER" -> {
                album = "Head Above Water"
                year = "2019"

                music = when (track) {
                    1 -> "Head Above Water"
                    2 -> "Birdie"
                    3 -> "I Fell In Love With The Devil"
                    4 -> "Tell Me It's Over"
                    5 -> "Dumb Blonde"
                    6 -> "It Was In Me"
                    7 -> "Souvenir"
                    8 -> "Crush"
                    9 -> "Goddess"
                    10 -> "Bigger Wow"
                    11 -> "Love Me Insane"
                    12 -> "Warrior"
                    else -> {
                        return notFound()
                    }
                }
            }
        }

        println("Now Listening: $track - $artista - $music ($album, $year)")
    }
}

