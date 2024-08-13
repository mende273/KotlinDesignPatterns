package structural

/**
 * The Proxy pattern provides a placeholder for another object
 * to control access to it.
 */

interface Image {
    fun display()
}

class RealImage(val filePath: String) : Image {
    override fun display() {
        println("Displaying $filePath")
    }
}

class ImageProxy(val filePath: String) : Image {
    private var realImage: RealImage? = null

    override fun display() {
        if (realImage == null) {
            realImage = RealImage(filePath)
        }
        realImage!!.display()
    }
}

// usage
fun main() {
    val imageProxy = ImageProxy("image.jpg")
    imageProxy.display()
}