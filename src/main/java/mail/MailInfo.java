package mail;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class MailInfo {
    Client client;
    MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }

    public String getMailText() {
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", Integer.toString(client.getAge()));
        for (String key : templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
     }

//    public String getMailText() {
//        String text = mailCode.
//    }
}
