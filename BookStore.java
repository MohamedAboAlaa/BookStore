import java.util.*;

public class BookStore {
    private Map<String, Book> inventory;
    
    public BookStore() {
        this.inventory = new HashMap<>();
    }
    
    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Added " + book.getTitle() + " by " + book.getAuthor() + " to inventory");
    }
    
    public List<Book> removeOutdatedBooks(int years) {
        List<Book> outdatedBooks = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            Book book = entry.getValue();
            if (book.isOutdated(years)) {
                outdatedBooks.add(book);
                iterator.remove();
                System.out.println("Quantum book store: Removed outdated book " + book.getTitle());
            }
        }
        
        return outdatedBooks;
    }
    
    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) {
            throw new RuntimeException("Book not found");
        }
        
        if (!book.isAvailable()) {
            throw new RuntimeException("Book not available for purchase");
        }
        
        book.purchase(quantity, email, address);
        double totalAmount = book.getPrice() * quantity;
        System.out.println("Quantum book store: Purchase completed. Total amount: $" + totalAmount);
        return totalAmount;
    }
    
    public Book getBook(String isbn) {
        return inventory.get(isbn);
    }
    
    public void displayInventory() {
        System.out.println("Quantum book store: Current inventory:");
        for (Book book : inventory.values()) {
            System.out.println("Quantum book store: " + book.getTitle() + " by " + book.getAuthor() + 
                             " (ISBN: " + book.getIsbn() + ", Year: " + book.getYear() + 
                             ", Price: $" + book.getPrice() + ")");
        }
    }
}