import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        
        PaperBook paperBook = new PaperBook("978-0134685991", "Effective Java", 2017, 45.99, "Joshua Bloch", 10);
        EBook ebook = new EBook("978-0135166307", "Clean Code", 2008, 29.99, "Robert Martin", "PDF");
        ShowcaseBook showcase = new ShowcaseBook("978-0201633610", "Design Patterns", 1994, 59.99, "Gang of Four");
        
        bookstore.addBook(paperBook);
        bookstore.addBook(ebook);
        bookstore.addBook(showcase);
        
        bookstore.displayInventory();
        
        System.out.println("\nQuantum book store: Testing book purchases...");
        
        try {
            double amount1 = bookstore.buyBook("978-0134685991", 2, "abo329947@gmail.com", "123 Main St");
            System.out.println("Quantum book store: Paper book purchase successful");
        } catch (Exception e) {
            System.out.println("Quantum book store: Error buying paper book: " + e.getMessage());
        }
        
        try {
            double amount2 = bookstore.buyBook("978-0135166307", 1, "abo329947@gmail.com", "123 Main St");
            System.out.println("Quantum book store: EBook purchase successful");
        } catch (Exception e) {
            System.out.println("Quantum book store: Error buying ebook: " + e.getMessage());
        }
        
        try {
            double amount3 = bookstore.buyBook("978-0201633610", 1, "abo329947@gmail.com", "123 Main St");
            System.out.println("Quantum book store: Showcase book purchase successful");
        } catch (Exception e) {
            System.out.println("Quantum book store: Error buying showcase book: " + e.getMessage());
        }
        
        System.out.println("\nQuantum book store: Testing outdated book removal...");
        List<Book> outdatedBooks = bookstore.removeOutdatedBooks(15);
        System.out.println("Quantum book store: Removed " + outdatedBooks.size() + " outdated books");
        
        bookstore.displayInventory();
        
        System.out.println("\nQuantum book store: Testing insufficient stock...");
        try {
            double amount4 = bookstore.buyBook("978-0134685991", 20, "abo329947@gmail.com", "123 Main St");
        } catch (Exception e) {
            System.out.println("Quantum book store: Error: " + e.getMessage());
        }
    }
}