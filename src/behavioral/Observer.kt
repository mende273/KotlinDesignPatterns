package behavioral

/**
 * The Observer pattern defines a one-to-many dependency between
 * objects, where changes to one object (subject) result in
 * notifications to its dependents (observers).
 */

interface Observer {
    fun update(data: Any)
}

interface Subject {
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notifyObservers(data: Any)
}

class ConcreteSubject : Subject {
    private val observers = mutableListOf<Observer>()

    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers(data: Any) {
        observers.forEach { it.update(data) }
    }
}

class ConcreteObserver : Observer {
    override fun update(data: Any) {
        println("Received update: $data")
    }
}

fun main() {
    val subject = ConcreteSubject()
    val observer1 = ConcreteObserver()
    val observer2 = ConcreteObserver()

    subject.attach(observer1)
    subject.attach(observer2)

    subject.notifyObservers("Hello, observers!")
}