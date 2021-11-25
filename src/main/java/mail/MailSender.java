package mail;

public class MailSender {
    public static void sendMail(MailInfo mailInfo) {
        System.out.printf("Mail\n\"%s\"\nwas sent to clienе %d\n",
                mailInfo.getMailText(), mailInfo.client.getId());
    }
}
