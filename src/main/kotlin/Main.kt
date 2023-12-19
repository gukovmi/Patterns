import java.io.File
import java.io.FileOutputStream

fun main() {
    val file = File("example.txt")
    FileOutputStream(file).use { it.write("file content".encodeToByteArray()) }

    val fileReader = FileReader(Logger(), TextReader(), FileAnalyzer())

    fileReader.read(file)
}