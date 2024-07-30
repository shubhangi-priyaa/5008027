public class Ex_2_ExcelDocumentFactory extends Ex_2_DocumentFactory {

    @Override
    public Ex_2_Document createDocument() {
        return new Ex_2_ExcelDocument();
    }
}
