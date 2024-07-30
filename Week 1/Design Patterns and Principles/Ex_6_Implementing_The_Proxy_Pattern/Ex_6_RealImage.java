// Implement Real Subject Class
public class Ex_6_RealImage implements Ex_6_Image {
    private String imageUrl;

    public Ex_6_RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        // Simulate loading image from a remote server
        System.out.println("Loading image from " + imageUrl);
    }

    @Override
    public void display() {
        System.out.println("Displaying image from " + imageUrl);
    }
}
