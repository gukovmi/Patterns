class Navigator(var strategy: NavigationStrategy) {

    fun search(start: String, finish: String) =
        strategy.buildRoute(start, finish)
}