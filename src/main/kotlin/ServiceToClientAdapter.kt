class ServiceToClientAdapter(private val service: Service) : Client {

    override fun sendReport(initValue: Int, endValue: Int, duration: Long) {
        service.sendReport("initValue: $initValue, endValue: $endValue, duration: $duration")
    }
}