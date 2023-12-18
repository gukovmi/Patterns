abstract class NotifierDecorator(private val notifier: Notifier) : Notifier() {

    override fun invoke() {
        notifier()
    }
}

open class SMSNotifierDecorator(notifier: Notifier) : NotifierDecorator(notifier) {

    override fun invoke() {
        super.invoke()
        println("SMS was sent")
    }
}

open class EmailNotifierDecorator(notifier: Notifier) : NotifierDecorator(notifier) {

    override fun invoke() {
        super.invoke()
        println("Email was sent")
    }
}