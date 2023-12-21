interface Storage {

    fun get(): String
}

class RemoteStorage : Storage {

    override fun get(): String =
        "Very important data"
}

class CachingStorage(private val remoteStorage: RemoteStorage) : Storage {

    private var cachedData: String? = null

    override fun get(): String =
        cachedData?.also { println("value from cache") }
            ?: remoteStorage.get()
                .also(::cachedData::set)
                .also { println("value from remote storage") }
}