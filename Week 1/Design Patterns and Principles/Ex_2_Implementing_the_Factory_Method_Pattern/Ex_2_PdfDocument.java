public class Ex_2_PdfDocument implements Ex_2_Document {

    @Override
    public void open() {
        System.out.println("Opening a PDF Document.");
    }

    @Override
    public void close() {
        System.out.println("Closing the PDF Document.");
    }
}
