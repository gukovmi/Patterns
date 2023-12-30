fun main() {
    val remoteSubscriber = RemoteSubscriber()
    val localSubscriber = LocalSubscriber()
    val publisher = Publisher()

    with(publisher) {
        subscribe(remoteSubscriber)
        subscribe(localSubscriber)

        notify("START")
        notify("LOADING")
        unsubscribe(remoteSubscriber)
        notify("FINISH")
    }
}