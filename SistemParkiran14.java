import java.util.Scanner;

public class SistemParkiran14{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi = 0, total = 0;

        do {
            System.out.print("Masukan jenis kendaraan (1: Mobil, 2: Motor, 0: Selesai): ");
            jenis = sc.nextInt();

            if ((jenis == 1) || (jenis == 2)) {
                System.out.print("Masukan durasi parkir (Jam): ");
                durasi = sc.nextInt();
            }

            if (jenis == 1) {
                total += durasi * 3000;
            } else {
                total += durasi * 2000;
            }
         
        }
        while (jenis != 0); 
                System.out.println("Total pembayaran parkir: Rp " + total);

        sc.close();
    }
}