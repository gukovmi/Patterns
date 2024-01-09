abstract class HouseFactory {

    fun create() {
        createFoundation()
        createFloor()
        createWalls()
        createRoof()
    }

    open fun createFoundation() {
        println("A foundation was created")
    }

    abstract fun createFloor()

    abstract fun createWalls()

    abstract fun createRoof()
}

class LuxuriousHouseFactory : HouseFactory() {

    override fun createFloor() {
        println("A floor was created from marble")
    }

    override fun createWalls() {
        println("Walls was created from gold")
    }

    override fun createRoof() {
        println("A roof was created from diamonds")
    }
}

class PoorHouseFactory : HouseFactory() {

    override fun createFloor() {
        println("A floor was created from wood")
    }

    override fun createWalls() {
        println("Walls was created from wood")
    }

    override fun createRoof() {
        println("A roof was created from wood")
    }
}