package creational

// implementation
data class Car(
    val model: String,
    val color: String = "red",
    val options: List<String> = emptyList()
)

// usage
fun main() {
    val car = Car(
        model = "car model",
        options = listOf("sunroof", "leather seats")
    )
}