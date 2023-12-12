object Logger {

    private var logger: Logger? = null

    fun getInstance(): Logger =
        logger ?: this
            .also { logger = it }
}