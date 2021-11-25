package mail;

//import org.reflections.Reflections;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Client client = new Client("Yura", 18, Gender.MALE);
        MailInfo mailInfo = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
        MailSender.sendMail(mailInfo);
    }
}
