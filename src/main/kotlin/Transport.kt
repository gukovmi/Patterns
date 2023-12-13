abstract class Transport {

    abstract fun move()
}

class AirTransport : Transport() {

    override fun move() {
        println("move through the air")
    }
}

class LandTransport : Transport() {

    override fun move() {
        println("move along the road")
    }
}