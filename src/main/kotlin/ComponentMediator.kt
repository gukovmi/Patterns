interface ComponentMediator {

    fun notify(component: Component, event: Event)
}

class Dialog : ComponentMediator {

    val checkBox = CheckBox(this, "Do you agree to data collection?")
    val button = Button(this, "Continue")

    override fun notify(component: Component, event: Event) {
        when (component) {
            checkBox -> handleCheckBoxEvent(event)
            button -> handleButtonEvent(event)
        }
    }

    private fun handleCheckBoxEvent(event: Event) {
        when (event) {
            Event.CLICK -> button.enabled = checkBox.checked
        }
    }

    private fun handleButtonEvent(event: Event) {
        when (event) {
            Event.CLICK -> if (button.enabled) {
                println("Consent to data collection has been confirmed")
            }
        }
    }

    override fun toString(): String =
        "Dialog content: Checkbox (text: ${checkBox.text}; checked: ${checkBox.checked}); " +
                "Button (text: ${button.text}; enabled: ${button.enabled})"
}