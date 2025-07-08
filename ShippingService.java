public class ShippingService {
    public static void ship(PaperBook book, String address) {
        System.out.println("Quantum book store: Shipping " + book.getTitle() + " to " + address);
    }
}