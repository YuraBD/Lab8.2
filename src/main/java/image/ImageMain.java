package image;

public class ImageMain {
    public static void main(String[] args) {
        ProxyPatternDemo proxyPatternDemo = new ProxyPatternDemo();
        Image realImage = new RealImage("image.png");
        Image proxyImage = new ProxyImage("image.png");
        proxyPatternDemo.displayImage(realImage);
        System.out.println();
        proxyPatternDemo.displayImage(proxyImage);
    }
}
