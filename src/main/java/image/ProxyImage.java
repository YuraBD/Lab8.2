package image;

public class ProxyImage implements Image {
    private Image realImage;
    private String fileName;


    public ProxyImage(String fileName) {
        this.fileName = fileName;
        this.realImage = new RealImage(fileName);
    }

    public void display() {
        System.out.println("Some operations before display");
        this.realImage.display();
        System.out.println("Some operations after display");
    }
}
