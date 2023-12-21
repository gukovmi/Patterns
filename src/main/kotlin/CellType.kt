import java.awt.image.BufferedImage

class CellType(val name: String, val image: BufferedImage) {

    companion object {

        const val TREASURE_NAME = "TREASURE"
        const val MONSTER_NAME = "MONSTER"
    }
}