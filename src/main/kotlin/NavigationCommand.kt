abstract class NavigationCommand {

    abstract fun execute()

    abstract fun undo()
}

class OpenNavigationCommand(private val navigator: Navigator, private val screenName: String) : NavigationCommand() {

    override fun execute() {
        navigator.open(screenName)
    }

    override fun undo() {
        navigator.back()
    }
}

class BackNavigationCommand(private val navigator: Navigator) : NavigationCommand() {

    private val currentScreen = navigator.getCurrentScreen()

    override fun execute() {
        navigator.back()
    }

    override fun undo() {
        currentScreen?.let(navigator::open)
    }
}