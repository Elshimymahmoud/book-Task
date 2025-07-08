public class DemoBook extends bookStore {

    public DemoBook(String isbn, String title, double price, int year, String author) {
        super(isbn, title, price, year, author);
    }

    @Override
    public boolean isAviliable(int quantity) {
return false;    }

    @Override
    public double buyBook(String isbn, int quantatiy, String email, String address) {
        throw new UnsupportedOperationException("Showcase books are not for sale");
    }

}
