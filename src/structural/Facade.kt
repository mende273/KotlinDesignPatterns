package structural

/**
 * The Facade pattern simplifies the interface to a complex
 * system by providing a single, unified interface to a set of
 * interfaces in a subsystem.
 */

data class Order(
    val orderId: String,
    val customerName: String,
    val products: List<Product>
)

data class Product(
    val productId: String,
    val name: String,
    val price: Double
)

class OrderValidator {
    fun validate(order: Order): Boolean {
        println("validate order $order")
        return true
    }
}

class OrderProcessor {
    fun process(order: Order) {
        println("Processing order $order")
    }
}

class OrderNotifier {
    fun notify(order: Order) {
        println("notify about order $order")
    }
}

class OrderFacade {
    private val orderValidator = OrderValidator()
    private val orderProcessor = OrderProcessor()
    private val orderNotifier = OrderNotifier()

    fun processOrder(order: Order) {
        if (orderValidator.validate(order)) {
            orderProcessor.process(order)
            orderNotifier.notify(order)
        }
    }
}

// usage
fun main() {
    val order = Order(
        orderId = "ORDER-1",
        customerName = "Name",
        products = listOf(
            Product("PROD-1", "Product A", 9.99),
            Product("PROD-2", "Product B", 18.99)
        )
    )
    val orderFacade = OrderFacade()
    orderFacade.processOrder(order)
}