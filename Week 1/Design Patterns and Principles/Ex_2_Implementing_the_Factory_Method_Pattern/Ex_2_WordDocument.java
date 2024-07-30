public class Ex_2_WordDocument implements Ex_2_Document {

    @Override
    public void open() {
        System.out.println("Opening a Word Document.");
    }

    @Override
    public void close() {
        System.out.println("Closing the Word Document.");
    }
}
