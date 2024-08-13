package creational

/**
 * The Builder pattern is particularly useful when constructing
 * objects with many optional parameters. It separates the
 * construction of a complex object from its representation,
 * making the process more readable and flexible.
 */

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