package structural

/**
 * The Adapter pattern allows incompatible interfaces to work together.
 * It acts as a bridge between two classes with different interfaces,
 * enabling them to collaborate.
 */

interface ModernSong {
    val id: Int
    val name: String
    val url: String
}

class LegacySong(val legacyId: String, val legacyName: String)

class LegacySongAdapter(private val legacySong: LegacySong) : ModernSong {
    override val id: Int
        get() = legacySong.legacyId.toInt()

    override val name: String
        get() = legacySong.legacyName

    override val url: String
        get() = "example.com/${legacySong.legacyId}"
}

// usage
fun main() {
    val legacySong = LegacySong("123", "Song Name")
    val adapter = LegacySongAdapter(legacySong)

    println(adapter.id)
    println(adapter.name)
    println(adapter.url)
}