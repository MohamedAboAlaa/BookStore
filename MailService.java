public class MailService {
    public static void sendEmail(EBook book, String email) {
        System.out.println("Quantum book store: Sending " + book.getTitle() + " (" + book.getFiletype() + ") to " + email);
    }
}