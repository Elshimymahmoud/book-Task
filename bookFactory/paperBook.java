public class paperBook extends bookStore {
    private int stock;

    public paperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, price, year, author);
        this.stock = stock;
    }

   
 @Override
    public boolean isAviliable(int quantity) {
        return stock >= quantity;
    }

    @Override
    public double buyBook(String isbn, int quantity, String email, String address) {
        if (!isAviliable(quantity)) {
            throw new RuntimeException("Quantum Bookstore: Not enough stock for ISBN: " + isbn);
        }
        stock -= quantity;
        ShippingService.send(this, address);
        System.out.println("Quantum Bookstore: Shipped paper book '" + title + "' to " + address);
        return price * quantity;
    }

   
}
