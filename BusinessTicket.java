class BusinessTicket extends Ticket {

    public BusinessTicket(String trainName, double price) {
        super(trainName, price);
    }

    @Override
    public String getTicketType() {
        return "Bisnis";
    }
}