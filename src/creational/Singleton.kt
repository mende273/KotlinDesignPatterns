package creational

/**
 * Kotlin provides a concise and elegant way to implement the
 * Singleton pattern using object declarations.
 */

object Logger {
    fun logMessage(message: String) {
        println(message)
    }
}

// usage
fun main() {
    Logger.logMessage("this is a log message")
}