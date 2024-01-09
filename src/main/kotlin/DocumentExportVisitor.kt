class DocumentExportVisitor {

    fun visitPDF(document: PDFDocument) {
        println("Export PDF document: $document")
    }

    fun visitDOC(document: DOCDocument) {
        println("Export DOC document: $document")
    }
}