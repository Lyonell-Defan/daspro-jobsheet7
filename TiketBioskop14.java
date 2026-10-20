import java.util.Scanner;

public class TiketBioskop14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        int totalPendapatan = 0;
        int jmlTiket = 0;
        int hargaDasar;
        double diskon = 0;
        int totalBayar;

        System.out.println("=== SISTEM PENJUALAN TIKET BIOSKOP === ");
        System.out.println("Ketik '0' pada jumlah tiket untuk menutup laporan hari ini");

        while (true) {
            System.out.print("Masukan jumlah tiket yang dibeli pelanggan: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                System.out.println("Input selesai. Memproses laporan harian...");
                System.out.println("== LAPORAN PENJUALAN TIKET ===");
                System.out.println("Total Tiker Terjual: " + totalTiket);
                System.out.println("Total Pendapatan: Rp " + totalPendapatan);
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid! Masukan ulang");
                continue;
            }

            hargaDasar = jmlTiket * hargaTiket;
            if (jmlTiket > 4) {
                diskon = 0.10;
            } else if (jmlTiket > 10) {
                diskon = 0.15;
            }
            totalBayar = (int) (hargaDasar - (hargaDasar * diskon));

            System.out.println("Total harga dasar: Rp " + hargaDasar);
            System.out.println("Potongan diskon: " + (diskon * 100) + "%");
            System.out.println("Total bayar: Rp " + totalBayar);

            totalTiket += jmlTiket;
            totalPendapatan += totalBayar;

            System.out.println("== LAPORAN PENJUALAN TIKET ===");
            System.out.println("Total Tiker Terjual: " + totalTiket);
            System.out.println("Total Pendapatan: Rp " + totalPendapatan);

        }

    }
}