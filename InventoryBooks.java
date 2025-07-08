import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InventoryBooks {
        private final Map<String, bookStore> inventory = new HashMap<>();

public void addBook(bookStore book) {
    inventory.put(book.getIsbn(), book);
    System.out.println("Quantum Bookstore: Book added - " + book.title);
}
 public Object removeBook(String isbn) {
        return inventory.remove(isbn);
    }


       public List<bookStore> removeOutdatedBooks(int maxAge, int currentYear) {
        List<bookStore> removed = new ArrayList<>();
        Iterator<bookStore> it = inventory.values().iterator();
        while (it.hasNext()) {
            bookStore b = it.next();
            if (currentYear - b.getYear() > maxAge) {
                removed.add(b);
                it.remove();
                System.out.println("Quantum Bookstore: Removed outdated book - " + b.title);
            }
        }
        return removed;
    }
       public double buyBook(String isbn, int quantatiy, String email, String address) {
        bookStore book = inventory.get(isbn);
        if (book == null) {
            throw new RuntimeException("Quantum Bookstore: Book not found with ISBN: " + isbn);
        }
        return book.buyBook( isbn,quantatiy, email, address);
    }
}
