package creational

/**
 * The Factory pattern is a creational design pattern that
 * provides an interface for creating objects, but lets
 * subclasses decide which class to instantiate.
 */

// factory pattern with sealed classes
sealed class Pet(val sound: String) {
    class Cat(sound: String) : Pet(sound)
    class Dog(sound: String) : Pet(sound)
}

fun createPet(type: String, sound: String): Pet = when (type) {
    "cat" -> Pet.Cat(sound)
    "dog" -> Pet.Dog(sound)
    else -> throw IllegalArgumentException("Unknown pet type")
}

//usage
fun main() {
    val cat = createPet("cat", "meow")
    val dog = createPet("dog", "woof")

    println(cat.sound)
    println(dog.sound)
}