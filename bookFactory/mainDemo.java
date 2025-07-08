public class mainDemo {
    public static void main(String[] args) {
        InventoryBooks store = new InventoryBooks();

        store.addBook(new paperBook("ISBN1", "Java Basics", 2018, 100.0, "Alice", 10));
        store.addBook(new ebook("ISBN2", "OOP with Java", 2020, (int) 80.0, "Bob", "PDF"));

        System.out.println("Buy paper book:");
        store.buyBook("ISBN1", 2, "test@example.com", "123 Cairo St");

        System.out.println("Buy eBook:");
        store.buyBook("ISBN2", 1, "user@example.com", "N/A");
    }
}
