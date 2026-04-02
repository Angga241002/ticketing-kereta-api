abstract class Ticket {
    protected String trainName;
    protected double price;

    public Ticket(String trainName, double price) {
        this.trainName = trainName;
        this.price = price;
    }

    public String getTrainName() {
        return trainName;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getTicketType();
}