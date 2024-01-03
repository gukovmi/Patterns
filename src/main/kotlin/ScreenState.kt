import kotlinx.coroutines.*

sealed interface ScreenState {

    fun next()
}

class InitialScreenState(private val controller: ScreenController) : ScreenState {

    override fun next() {
        controller.screenState = LoadingScreenState(controller)
    }
}

class LoadingScreenState(private val controller: ScreenController) : ScreenState {

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    private var isLoading = true

    init {
        scope.launch {
            delay(3000)
            isLoading = false
        }
    }

    override fun next() {
        if (isLoading) {
            println("Loading is not completed")
        } else {
            controller.screenState = ContentScreenState
        }
    }
}

object ContentScreenState : ScreenState {

    override fun next() {
        println("Open next screen")
    }
}