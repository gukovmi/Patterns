interface Storage {

    fun get(): String

    fun set(data: String)
}

class LocalStorage : Storage {

    private var data = ""

    override fun get(): String =
        data

    override fun set(data: String) {
        println("Set data ($data) to local storage")
        this.data = data
    }
}

class RemoteStorage : Storage {

    private var data = ""

    override fun get(): String =
        data

    override fun set(data: String) {
        println("Set data to remote storage")
        this.data = data
    }
}