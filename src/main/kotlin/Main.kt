fun main() {
    val furnitureStyle = "MODERN"

    val furnitureFactory = when (furnitureStyle) {
        "MODERN" -> ModernFurnitureFactory()
        "VINTAGE" -> VintageFurnitureFactory()
        else -> throw IllegalArgumentException("Unknown furnitureStyle: $furnitureStyle")
    }

    val chair = furnitureFactory.createChair()
    val table = furnitureFactory.createTable()

    println("chair: $chair")
    println("table: $table")
}