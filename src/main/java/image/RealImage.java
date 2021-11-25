package image;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Displaying image");
    }

    public void loadFromDisk() {
        System.out.println("Loading image from disk");
    }
}
