import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    val screenController = ScreenController()

    screenController.next() // change state to Loading
    screenController.next() // unsuccessful state changing because loading wasn't completed

    runBlocking {
        delay(3100) // wait until loading finish
        screenController.next() // change state to Content
        screenController.next() // go to next screen
    }
}