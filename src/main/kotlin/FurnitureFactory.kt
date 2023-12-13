interface FurnitureFactory {

    fun createChair(): Chair

    fun createTable(): Table
}

class ModernFurnitureFactory : FurnitureFactory {

    override fun createChair(): Chair =
        ModernChair()

    override fun createTable(): Table =
        ModernTable()
}

class VintageFurnitureFactory : FurnitureFactory {

    override fun createChair(): Chair =
        VintageChair()

    override fun createTable(): Table =
        VintageTable()
}