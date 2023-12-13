abstract class TransportFactory {

    abstract fun create(): Transport
}

class AirTransportFactory : TransportFactory() {

    override fun create(): Transport =
        AirTransport()
}

class LandTransportFactory : TransportFactory() {

    override fun create(): Transport =
        LandTransport()
}