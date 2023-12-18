fun main() {
    val cargo = Box(
        setOf(
            Box(setOf(Product(10), Box(setOf(Product(30))))),
            Product(20)
        ),
    )

    println(cargo.price)
}