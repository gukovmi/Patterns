fun main() {
    val notifier = Notifier()
        .let(::SMSNotifierDecorator)
        .let(::EmailNotifierDecorator)

    notifier()
}