fun main() {
    val presenter = Presenter("Payment screen", "Pay for service", false)

    println("Presenter's state was saved")
    val memento = presenter.save()
    println(presenter.toString())

    with(presenter) {
        description = "Payment in progress"
        hasLoading = true
    }
    println("Presenter's state was changed")
    println(presenter.toString())

    println("Presenter's state was restored")
    presenter.restore(memento)
    println(presenter.toString())
}