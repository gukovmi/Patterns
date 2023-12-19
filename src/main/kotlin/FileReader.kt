import java.io.File

class FileReader(
    private val logger: Logger,
    private val textReader: TextReader,
    private val fileAnalyzer: FileAnalyzer,
) {

    fun read(file: File) {
        if (fileAnalyzer.isReadable(file)) {
            logger.log("start reading")
            logger.log(textReader.read(file))
            logger.log("end reading")
        } else {
            throw IllegalArgumentException("file is not readable")
        }
    }
}