public class PaperBook extends Book {
    private int stock;
    
    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public boolean isAvailable() {
        return stock > 0;
    }
    
    @Override
    public void purchase(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new RuntimeException("Not enough stock available");
        }
        stock -= quantity;
        ShippingService.ship(this, address);
    }
    
    @Override
    public boolean isOutdated(int years) {
        return java.time.Year.now().getValue() - this.year > years;
    }
}