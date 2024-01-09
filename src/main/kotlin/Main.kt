fun main() {
    val roadNavigationStrategy = RoadNavigationStrategy()
    val airNavigationStrategy = AirNavigationStrategy()
    val start = "New York"
    val end = "Los Angeles"

    val navigator = Navigator(roadNavigationStrategy)
    println(navigator.search(start, end))

    navigator.strategy = airNavigationStrategy
    println(navigator.search(start, end))
}