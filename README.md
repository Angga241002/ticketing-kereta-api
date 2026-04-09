# Sistem Penjualan Tiket Kereta Api (Java OOP)

## Deskripsi

Aplikasi ini merupakan simulasi pemesanan tiket kereta api berbasis Java dengan menerapkan konsep Object Oriented Programming (OOP).

## Konsep OOP yang Digunakan

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interface

## Struktur Class

- Ticket (Abstract Class)
- EconomyTicket dan BusinessTicket (Inheritance)
- PaymentInterface
- CreditCardPayment dan EWalletPayment
- Booking

## Cara Menjalankan Program

1. Compile program:
   javac \*.java

2. Jalankan program:
   java Main

## Contoh Output

=== Detail Booking ===
Kereta : KA Argo Bromo
Jenis : Ekonomi
Harga : Rp 150000
Pembayaran Rp 150000 dengan E-Wallet

## Author

Angga Pratama

## Perubahan (Tugas Pertemuan 3)

Pada versi ini, data tiket yang sebelumnya bersifat statis telah diubah menjadi dinamis menggunakan Collection (List).

Pengguna dapat memilih tiket berdasarkan daftar yang ditampilkan, sehingga data kereta dan harga diambil langsung dari List dan diproses secara otomatis.

## Teknologi yang Digunakan

- Java
- Object Oriented Programming (OOP)
- Java Collection (List)
