
public class MailService {

    public static void send(ebook book, String email) {
        System.out.println(" Email sent to " + email + " with eBook: " + book.getIsbn());
    }

}
