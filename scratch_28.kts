fun main() {
    val oasisSong = Song("whatever", "oasis", 1994, 100_000_000)
    oasisSong.description()
    println(oasisSong.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val year: Int,
    val count: Int
) {
    val isPopular : Boolean
        get() = count >= 1000

    fun description() {
        println("제목: $title, 아티스트: $artist, 발표 연도: $year ")
    }
}

main()