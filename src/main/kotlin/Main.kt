fun main() {
    val textValidatorsChain = createTextValidatorsChain()

    textValidatorsChain.handle("Text for validation testing")
}

private fun createTextValidatorsChain(): TextValidator =
    ForbiddenSymbolsValidator().apply {
        setNextValidator(ExtraSpaceValidator())
    }