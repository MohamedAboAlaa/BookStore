public class EBook extends Book {
    private String filetype;
    
    public EBook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }
    
    public String getFiletype() {
        return filetype;
    }
    
    @Override
    public boolean isAvailable() {
        return true;
    }
    
    @Override
    public void purchase(int quantity, String email, String address) {
        MailService.sendEmail(this, email);
    }
    
    @Override
    public boolean isOutdated(int years) {
        return java.time.Year.now().getValue() - this.year > years;
    }
}