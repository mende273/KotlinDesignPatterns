package structural

/** The Decorator pattern allows you to add new behaviors to an object
dynamically without changing its structure. It's often used to add
features like logging, caching, or validation.
 */

interface Coffee {
    fun cost(): Double
    fun getDescription(): String
}

class Espresso : Coffee {
    override fun cost(): Double = 1.99
    override fun getDescription(): String = "Espresso"
}

abstract class CoffeeDecorator(protected val coffee: Coffee) : Coffee

class Milk(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Double = coffee.cost() + 0.5
    override fun getDescription(): String = coffee.getDescription() + ", Milk"
}

class Sugar(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Double = coffee.cost() + 0.2
    override fun getDescription(): String = coffee.getDescription() + ", Sugar"
}

// usage
fun main() {
    val espresso = Espresso()
    println("${espresso.getDescription()} costs $${espresso.cost()}")

    val coffeeWithMilk = Milk(espresso)
    println("${coffeeWithMilk.getDescription()} costs $${coffeeWithMilk.cost()}")

    val coffeeWithMilkAndSugar = Sugar(Milk(espresso))
    println("${coffeeWithMilkAndSugar.getDescription()} costs $${coffeeWithMilkAndSugar.cost()}")
}