abstract class TextValidator {

    protected var next: TextValidator? = null

    fun setNextValidator(validator: TextValidator) {
        next = validator
    }

    abstract fun handle(text: String)

    protected fun goNext(text: String) {
        next?.handle(text) ?: println("Successful validation!")
    }
}

class ForbiddenSymbolsValidator : TextValidator() {

    override fun handle(text: String) {
        if (text.contains(Regex("[`^|*]"))) {
            println("Unsuccessful validation, text contains forbidden symbols")
        } else {
            goNext(text)
        }
    }
}

class ExtraSpaceValidator : TextValidator() {

    override fun handle(text: String) {
        if (text.contains("  ")) {
            println("Unsuccessful validation, text contains extra spaces")
        } else {
            goNext(text)
        }
    }
}