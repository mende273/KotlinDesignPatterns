package creational

// implementation
object Logger {
    fun logMessage(message: String) {
        println(message)
    }
}

// usage
fun main() {
    Logger.logMessage("this is a log message")
}