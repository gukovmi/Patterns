class DocumentExportVisitor {

    fun visit(document: PDFDocument) {
        println("Export PDF document: $document")
    }

    fun visit(document: DOCDocument) {
        println("Export DOC document: $document")
    }
}