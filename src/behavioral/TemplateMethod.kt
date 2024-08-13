package behavioral

/**
 * The Template Method pattern defines a skeleton of an
 * algorithm in a superclass, but lets subclasses override
 * specific steps without changing the algorithm's structure.
 */

abstract class Game {
    fun play() {
        initialize()
        start()
        playGame()
        end()
    }

    open fun initialize() {
        println("Initializing game")
    }

    abstract fun start()

    abstract fun playGame()

    open fun end() {
        println("Game over")
    }
}

class Level1Game : Game() {
    override fun start() {
        println("Starting level 1")
    }

    override fun playGame() {
        println("Playing level 1")
    }
}

class Level2Game : Game() {
    override fun start() {
        println("Starting level 2")
    }

    override fun playGame() {
        println("Playing level 2")
    }
}

// usage
fun main() {
    val level1 = Level1Game()
    level1.play()

    val level2 = Level2Game()
    level2.play()
}