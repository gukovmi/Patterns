class Navigator {

    private val screens = mutableListOf<String>()

    fun open(name: String) {
        screens.add(name)
        println("Open screen: $name, current stack: $screens")
    }

    fun back() {
        screens.removeLastOrNull()
        screens.lastOrNull()?.let { println("Navigation back to $it, current stack: $screens") }
    }

    fun getCurrentScreen(): String? =
        screens.lastOrNull()
}