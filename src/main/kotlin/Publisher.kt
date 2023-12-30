class Publisher {

    private val subscribers = mutableSetOf<Subscriber>()

    fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    fun notify(event: String) {
        subscribers.forEach { it.notify(event) }
    }
}