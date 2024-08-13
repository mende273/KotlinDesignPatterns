package creational

/**
 * The Prototype pattern is a creational design pattern that involves
 * creating objects based on a template of an existing object
 * through cloning.
 */

data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Name", 30)
    val person2 = person1.copy(age = 35)

    println(person1)
    println(person2)
}