interface Subscriber {

    fun notify(event: String)
}

class RemoteSubscriber : Subscriber {

    override fun notify(event: String) {
        println("Event ($event) for remote subscriber")
    }
}

class LocalSubscriber : Subscriber {

    override fun notify(event: String) {
        println("Event ($event) for local subscriber")
    }
}