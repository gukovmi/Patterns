interface Cargo {

    val price: Int
}

class Box(private val cargos: Set<Cargo>) : Cargo {

    override val price: Int
        get() = cargos.sumOf(Cargo::price)
}

class Product(override val price: Int) : Cargo