package mail;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        Path pt = Paths.get("");
        System.out.println(pt.toAbsolutePath().toString());
        System.out.println();
        File file = new File(String.format("./src/main/java/mail/%s", filename));
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");

        return sc.next();
    }
}
