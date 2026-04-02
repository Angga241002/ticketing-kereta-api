class EconomyTicket extends Ticket {

    public EconomyTicket(String trainName, double price) {
        super(trainName, price);
    }

    @Override
    public String getTicketType() {
        return "Ekonomi";
    }
}