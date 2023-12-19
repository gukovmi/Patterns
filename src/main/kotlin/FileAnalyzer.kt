import java.io.File

class FileAnalyzer {

    fun isReadable(file: File): Boolean =
        file.canRead()
}