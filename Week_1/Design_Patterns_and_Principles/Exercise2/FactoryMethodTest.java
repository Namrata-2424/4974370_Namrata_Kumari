package Exercise2;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // Create factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Create documents
        Document wordDocument = wordFactory.createDocument();
        Document pdfDocument = pdfFactory.createDocument();
        Document excelDocument = excelFactory.createDocument();

        // Open documents
        wordDocument.open();
        pdfDocument.open();
        excelDocument.open();
    }
}

