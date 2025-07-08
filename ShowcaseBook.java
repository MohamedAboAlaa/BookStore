public class ShowcaseBook extends Book {
    
    public ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }
    
    @Override
    public boolean isAvailable() {
        return false;
    }
    
    @Override
    public void purchase(int quantity, String email, String address) {
        throw new RuntimeException("Showcase books are not for sale");
    }
    
    @Override
    public boolean isOutdated(int years) {
        return java.time.Year.now().getValue() - this.year > years;
    }
}