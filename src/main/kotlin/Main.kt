import CellType.Companion.MONSTER_NAME
import CellType.Companion.TREASURE_NAME
import kotlin.random.Random

fun main() {
    val corridor = createRandomCorridor()

    corridor.cells.forEach { println("position: ${it.position}, name: ${it.type.name}, image: ${it.type.image.hashCode()}") }
}

private fun createRandomCorridor(): Corridor {
    val corridor = Corridor()
    val cellTypeFactory = CellTypeFactory()

    for (position in 0..100000) {
        val cellType = cellTypeFactory.get(getRandomCellTypeName())
        val cell = Cell(position, cellType)
        corridor.addCell(cell)
    }

    return corridor
}

private fun getRandomCellTypeName(): String =
    if (Random.nextBoolean()) {
        TREASURE_NAME
    } else {
        MONSTER_NAME
    }