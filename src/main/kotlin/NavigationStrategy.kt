interface NavigationStrategy {

    fun buildRoute(start: String, finish: String): String
}

class RoadNavigationStrategy : NavigationStrategy {

    override fun buildRoute(start: String, finish: String): String =
        "Route from $start to $finish along the roads"
}

class AirNavigationStrategy : NavigationStrategy {

    override fun buildRoute(start: String, finish: String): String =
        "Route from $start to $finish by air"
}