class Booking {
    private Ticket ticket;
    private PaymentInterface paymentMethod;

    public Booking(Ticket ticket, PaymentInterface paymentMethod) {
        this.ticket = ticket;
        this.paymentMethod = paymentMethod;
    }

    public void processBooking() {
        System.out.println("=== Detail Booking ===");
        System.out.println("Kereta : " + ticket.getTrainName());
        System.out.println("Jenis  : " + ticket.getTicketType());
        System.out.println("Harga  : Rp " + ticket.getPrice());
        System.out.println(paymentMethod.pay(ticket.getPrice()));
    }
}