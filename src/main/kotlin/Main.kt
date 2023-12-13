fun main() {
    val transportType = "AIR"

    val transportFactory = when (transportType) {
        "AIR" -> AirTransportFactory()
        "LAND" -> LandTransportFactory()
        else -> throw IllegalArgumentException("Unknown transportType: $transportType")
    }
    val transport = transportFactory.create()

    transport.move()
}