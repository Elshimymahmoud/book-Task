
public class ShippingService {

    static void send(paperBook book, String address) {
        System.out.println(" Paper book shipped to: " + address + " (ISBN: " + book.getIsbn() + ")");
    }

}
