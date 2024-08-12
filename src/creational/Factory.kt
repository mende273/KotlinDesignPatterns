package creational

// implementation
interface Document {
    fun getContent(): String
}

class PdfDocument(private val content: String) : Document {
    override fun getContent(): String = content
}

class WordDocument(private val content: String) : Document {
    override fun getContent(): String = content
}

class DocumentFactory {
    fun createDocument(type: String, content: String): Document {
        return when (type) {
            "pdf" -> PdfDocument(content)
            "word" -> WordDocument(content)
            else -> throw IllegalArgumentException("Unknown document type")
        }
    }
}

// usage
fun main() {
    val documentFactory = DocumentFactory()
    val pdfDocument = documentFactory.createDocument("pdf", "This is a PDF document")
    val wordDocument = documentFactory.createDocument("word", "This is a Word document")

    println(pdfDocument.getContent())
    println(wordDocument.getContent())
}