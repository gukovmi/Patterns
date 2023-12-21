import CellType.Companion.MONSTER_NAME
import CellType.Companion.TREASURE_NAME
import java.awt.image.BufferedImage

class CellTypeFactory {

    private val cellTypes: MutableMap<String, CellType> = mutableMapOf()

    fun get(name: String): CellType =
        cellTypes[name] ?: CellType(name, getImage(name))
            .also { cellTypes[name] = it }

    private fun getImage(name: String): BufferedImage =
        when (name) {
            TREASURE_NAME -> BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB)
            MONSTER_NAME -> BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB)
            else -> throw IllegalArgumentException("Unknown name: $name")
        }
}