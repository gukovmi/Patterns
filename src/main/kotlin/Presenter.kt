class Presenter(var title: String, var description: String, var hasLoading: Boolean) {

    fun save(): Memento =
        PresenterMemento(title, description, hasLoading)

    fun restore(memento: Memento) {
        val presenterMemento = memento as? PresenterMemento ?: return
        title = presenterMemento.title
        description = presenterMemento.description
        hasLoading = presenterMemento.hasLoading
    }

    override fun toString(): String =
        "Presenter content (title: $title, description: $description, hasLoading: $hasLoading)"

    private class PresenterMemento(val title: String, val description: String, val hasLoading: Boolean) : Memento
}