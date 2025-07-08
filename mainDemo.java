public class mainDemo {
public static void main(String[] args) {
        InventoryBooks store = new InventoryBooks();

        store.addBook(new paperBook("ISBN1", "Java Basics", 2018, 100.0, "Alice", 10));
        store.addBook(new ebook("ISBN2", "Learn Python", 2020, (int) 60.0, "Bob", ".pdf"));
        store.addBook(new DemoBook("ISBN3", "History of Code", 2000, 0, "Carol"));

        store.removeOutdatedBooks(5, 2025);

        try {
            double paid = store.buyBook("ISBN1", 2, "user@example.com", "Cairo, Egypt");
            System.out.println("Quantum Bookstore: Paid amount = " + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("ISBN3", 1, "user@example.com", "Alexandria");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
