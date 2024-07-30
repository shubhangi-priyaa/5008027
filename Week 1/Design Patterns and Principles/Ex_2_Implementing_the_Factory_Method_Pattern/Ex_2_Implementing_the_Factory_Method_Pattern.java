/*Scenario: 
You are developing a document management system that needs to create different types of documents (e.g., Word, PDF, Excel). Use the Factory Method Pattern to achieve this.
Steps:
1.	Create a New Java Project:
o	Create a new Java project named FactoryMethodPatternExample.
2.	Define Document Classes:
o	Create interfaces or abstract classes for different document types such as WordDocument, PdfDocument, and ExcelDocument.
3.	Create Concrete Document Classes:
o	Implement concrete classes for each document type that implements or extends the above interfaces or abstract classes.
4.	Implement the Factory Method:
o	Create an abstract class DocumentFactory with a method createDocument().
o	Create concrete factory classes for each document type that extends DocumentFactory and implements the createDocument() method.
5.	Test the Factory Method Implementation:
o	Create a test class to demonstrate the creation of different document types using the factory method.
 */
public class Ex_2_Implementing_the_Factory_Method_Pattern {

    public static void main(String[] args) {
        // Create factory instances
        Ex_2_DocumentFactory wordFactory = new Ex_2_WordDocumentFactory();
        Ex_2_DocumentFactory pdfFactory = new Ex_2_PdfDocumentFactory();
        Ex_2_DocumentFactory excelFactory = new Ex_2_ExcelDocumentFactory();

        // Use factories to create documents
        Ex_2_Document wordDoc = wordFactory.createDocument();
        Ex_2_Document pdfDoc = pdfFactory.createDocument();
        Ex_2_Document excelDoc = excelFactory.createDocument();

        // Test the created documents
        wordDoc.open();
        wordDoc.close();

        pdfDoc.open();
        pdfDoc.close();

        excelDoc.open();
        excelDoc.close();
    }
}
