abstract class Document {

    abstract fun accept(visitor: DocumentExportVisitor)
}

class PDFDocument : Document() {

    override fun accept(visitor: DocumentExportVisitor) {
        visitor.visit(this)
    }
}

class DOCDocument : Document() {

    override fun accept(visitor: DocumentExportVisitor) {
        visitor.visit(this)
    }
}