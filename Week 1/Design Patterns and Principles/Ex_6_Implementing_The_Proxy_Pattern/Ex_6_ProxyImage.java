//3. Implement Proxy Class
public class Ex_6_ProxyImage implements Ex_6_Image {
    private Ex_6_RealImage realImage;
    private String imageUrl;
    private boolean isImageLoaded = false;

    public Ex_6_ProxyImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        if (!isImageLoaded) {
            realImage = new Ex_6_RealImage(imageUrl);
            isImageLoaded = true;
        }
        realImage.display();
    }
}
