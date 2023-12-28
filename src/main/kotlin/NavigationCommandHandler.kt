class NavigationCommandHandler {

    private val commands = mutableListOf<NavigationCommand>()

    fun execute(command: NavigationCommand) {
        commands.add(command)
        command.execute()
    }

    fun undo() {
        commands.removeLastOrNull()?.undo()
    }
}