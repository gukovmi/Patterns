fun main() {
    val service = Service()
    val client = ServiceToClientAdapter(service)

    client.sendReport(1, 100, 1000)
}