fun main() {
    val cachingStorage = CachingStorage(RemoteStorage())

    cachingStorage.get()
    cachingStorage.get()
    cachingStorage.get()
}