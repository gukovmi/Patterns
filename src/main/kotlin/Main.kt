fun main() {
    val car = CarBuilder().reset()
        .setEngine("DIESEL")
        .setWheels("HANKOOK")
        .setSeats("RACING")
        .build()

    println(car)
}