fun main() {
    val controllerType = "ADVANCED"
    val storageType = "LOCAL"

    val storage = getStorage(storageType)
    useController(controllerType, storage)
}

private fun getStorage(type: String): Storage =
    when (type) {
        "REMOTE" -> RemoteStorage()
        "LOCAL" -> LocalStorage()
        else -> throw IllegalArgumentException("Unknown storageType: $type")
    }

private fun useController(type: String, storage: Storage) {
    when (type) {
        "ADVANCED" -> useAdvancedController(storage)
        "BASE" -> useBaseController(storage)
        else -> throw IllegalArgumentException("Unknown controllerType: $type")
    }
}

private fun useBaseController(storage: Storage) {
    val controller = BaseController(storage)
    controller.saveData("qwerty")
    println("Data from base controller: ${controller.readData()}")
}

private fun useAdvancedController(storage: Storage) {
    val controller = AdvancedController(storage)

    controller.saveData("qwerty")
    println("Data from advanced controller: ${controller.readData()}")

    controller.clearData()
    println("Data from advanced controller: ${controller.readData()}")
}