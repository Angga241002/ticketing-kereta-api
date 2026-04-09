import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Ticket> daftarKereta = new ArrayList<>();
        daftarKereta.add(new EconomyTicket("KA Argo Bromo", 150000));
        daftarKereta.add(new BusinessTicket("KA Argo Lawu", 250000));
        daftarKereta.add(new BusinessTicket("KA Pangandaran", 250000));
         daftarKereta.add(new EconomyTicket("KA Jakarta", 75000));


        System.out.println("=== Daftar Kereta ===");
        for (int i = 0; i < daftarKereta.size(); i++) {
            Ticket t = daftarKereta.get(i);
            System.out.println((i+1) + ". " + t.getTrainName() + 
                               " (" + t.getTicketType() + ") - Rp " + t.getPrice());
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Pilih nomor kereta: ");
        int pilihan = input.nextInt();

        Ticket tiketDipilih = daftarKereta.get(pilihan - 1);

        PaymentInterface payment = new EWalletPayment();
        Booking booking = new Booking(tiketDipilih, payment);
        booking.processBooking();
    }
}