public class Main {
    public static void main(String[] args) {

        Ticket ticket = new EconomyTicket("KA Argo Bromo", 150000);
        // Ticket ticket = new BusinessTicket("KA Argo Bromo", 300000);

        PaymentInterface payment = new EWalletPayment();
        // PaymentInterface payment = new CreditCardPayment();

        Booking booking = new Booking(ticket, payment);
        booking.processBooking();
    }
}