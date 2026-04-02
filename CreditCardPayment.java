class CreditCardPayment implements PaymentInterface {

    @Override
    public String pay(double amount) {
        return "Pembayaran Rp " + amount + " dengan Kartu Kredit";
    }
}