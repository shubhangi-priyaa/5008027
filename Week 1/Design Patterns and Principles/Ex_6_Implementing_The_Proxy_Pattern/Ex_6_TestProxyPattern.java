//4. Test the Proxy Implementation
public class Ex_6_TestProxyPattern {
    public static void main(String[] args) {
        Ex_6_Image image1 = new Ex_6_ProxyImage("http://example.com/image1.jpg");
        Ex_6_Image image2 = new Ex_6_ProxyImage("http://example.com/image2.jpg");

        // Image will be loaded and displayed
        System.out.println("First display call for image1:");
        image1.display();

        // Image will be displayed directly from the cache
        System.out.println("Second display call for image1:");
        image1.display();

        // Image will be loaded and displayed
        System.out.println("Display call for image2:");
        image2.display();
    }
}
