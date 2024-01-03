class ScreenController {

    var screenState: ScreenState = InitialScreenState(this)
        set(value) {
            println("Change state to $value")
            field = value
        }

    fun next() {
        screenState.next()
    }
}