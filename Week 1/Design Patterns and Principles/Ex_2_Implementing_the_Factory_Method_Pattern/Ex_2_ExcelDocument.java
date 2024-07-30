public class Ex_2_ExcelDocument implements Ex_2_Document {

    @Override
    public void open() {
        System.out.println("Opening an Excel Document.");
    }

    @Override
    public void close() {
        System.out.println("Closing the Excel Document.");
    }
}
