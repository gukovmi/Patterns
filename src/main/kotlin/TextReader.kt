import java.io.File

class TextReader {

    fun read(file: File): String =
        file.readText()
}