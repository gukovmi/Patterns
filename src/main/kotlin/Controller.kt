open class BaseController(private val storage: Storage) {

    fun saveData(value: String) {
        storage.set(value)
    }

    fun readData(): String =
        storage.get()
}

class AdvancedController(private val storage: Storage) : BaseController(storage) {

    fun clearData() {
        storage.set("")
    }
}