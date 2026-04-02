class EWalletPayment implements PaymentInterface {

    @Override
    public String pay(double amount) {
        return "Pembayaran Rp " + amount + " dengan E-Wallet";
    }
}