class LinkedCollection<T>(vararg elements: T) : Collection<T> {

    private class Element<T>(var value: T, var next: Element<T>?)

    private var first: Element<T>? = null

    init {
        if (elements.isNotEmpty()) {
            initWithNotEmptyElements(*elements)
        }
    }

    private fun initWithNotEmptyElements(vararg elements: T) {
        var previousElement: Element<T>? = null

        elements.forEachIndexed { index, value ->
            if (index == 0) {
                first = Element(value = value, next = null)
                previousElement = first
            } else {
                val element = Element(value = value, next = null)
                previousElement?.next = element
                previousElement = element
            }
        }
    }

    override val size: Int
        get() {
            val iterator = LinkedCollectionIterator()
            var size = 0

            while (iterator.hasNext()) {
                size += 1
                iterator.next()
            }
            return size
        }

    override fun isEmpty(): Boolean =
        size == 0

    override fun iterator(): Iterator<T> =
        LinkedCollectionIterator()

    override fun containsAll(elements: Collection<T>): Boolean =
        elements.all { contains(it) }

    override fun contains(element: T): Boolean {
        val iterator = LinkedCollectionIterator()

        while (iterator.hasNext()) {
            if (iterator.next() == element) return true
        }
        return false
    }

    private inner class LinkedCollectionIterator : Iterator<T> {

        private var currentElement: Element<T>? = null

        override fun hasNext(): Boolean =
            if (currentElement == null) {
                first != null
            } else {
                currentElement?.next != null
            }

        override fun next(): T {
            currentElement = if (currentElement == null) {
                first
            } else {
                currentElement?.next
            }

            return currentElement?.value ?: throw NoSuchElementException()
        }
    }
}