fun main() {
    val navigator = Navigator()
    val navigationCommandHandler = NavigationCommandHandler()

    with(navigationCommandHandler) {
        execute(OpenNavigationCommand(navigator, "Feed screen"))
        execute(OpenNavigationCommand(navigator, "Profile screen"))
        execute(BackNavigationCommand(navigator))
        undo()
        undo()
    }
}