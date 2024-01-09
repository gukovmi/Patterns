fun main() {
    val documents = listOf(PDFDocument(), DOCDocument())
    val visitor = DocumentExportVisitor()

    documents.forEach { it.accept(visitor) }
}