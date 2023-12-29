open class Component(
    private val mediator: ComponentMediator,
    val text: String
) {

    open fun click() {
        mediator.notify(this, Event.CLICK)
    }
}

class CheckBox(mediator: ComponentMediator, text: String) : Component(mediator, text) {

    var checked = false

    override fun click() {
        checked = !checked
        super.click()
    }
}

class Button(mediator: ComponentMediator, text: String) : Component(mediator, text) {

    var enabled = false
}