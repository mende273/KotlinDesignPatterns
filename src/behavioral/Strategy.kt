package behavioral

/**
 * The Strategy pattern is a behavioral design pattern that
 * allows you to dynamically change the algorithm used by an
 * object at runtime without modifying its structure.
 */
interface PaymentStrategy {
    fun processPayment(amount: Double): Boolean
}

class CreditCardPayment : PaymentStrategy {
    override fun processPayment(amount: Double): Boolean {
        println("Processing card payment of $amount")
        return true
    }
}

class OtherPayment : PaymentStrategy {
    override fun processPayment(amount: Double): Boolean {
        println("Processing other payment of $amount")
        return true
    }
}

class Order(private val paymentStrategy: PaymentStrategy) {

    fun checkout(amount: Double): Boolean {
        return paymentStrategy.processPayment(amount)
    }
}

// usage
fun main() {
    val orderWithCreditCard = Order(CreditCardPayment())
    val orderWithOtherPayment = Order(OtherPayment())

    orderWithCreditCard.checkout(120.0)
    orderWithOtherPayment.checkout(56.0)
}