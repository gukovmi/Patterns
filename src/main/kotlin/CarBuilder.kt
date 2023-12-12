class CarBuilder {

    private var engine: String? = null
    private var wheels: String? = null
    private var seats: String? = null

    fun setEngine(value: String): CarBuilder {
        engine = value
        return this
    }

    fun setWheels(value: String): CarBuilder {
        wheels = value
        return this
    }

    fun setSeats(value: String): CarBuilder {
        seats = value
        return this
    }

    fun build(): Car =
        Car(
            engine = engine,
            wheels = wheels,
            seats = seats,
        )

    fun reset(): CarBuilder {
        engine = null
        wheels = null
        seats = null
        return this
    }
}