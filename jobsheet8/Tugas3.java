package jobsheet8;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int totalpesanan = 0;
        int totalseluruhpelanggan = 0;
        int totalseluruhpesanan = 0;
        int jumlahcabang;
        int cabang, totalpelanggan, pelanggan, pesanan;

        System.out.print("Jumlah Cabang Kafe : ");
        jumlahcabang = sc.nextInt();
        System.out.println();

        System.out.println("=== Input Penjualan Per Cabang ===");
        System.out.println();
      
        for (cabang = 1; cabang <= jumlahcabang; cabang++) {
            System.out.println("--- Cabang " + cabang +" ---");

            System.out.print("Jumlah pelanggan : ");
            totalpelanggan = sc.nextInt();
            totalpesanan = 0;


            for (pelanggan = 1; pelanggan <= totalpelanggan; pelanggan++) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item ? ");
                pesanan = sc.nextInt();
                totalpesanan += pesanan;
                

            }
            
            totalseluruhpelanggan += totalpelanggan;
            totalseluruhpesanan += totalpesanan;  

            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan: " + totalpelanggan + " orang");
            System.out.println("- Item terjual: "+ totalpesanan);
            System.out.println();
           
        }
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalseluruhpelanggan + " orang");
        System.out.println("Item terjual: "+ totalseluruhpesanan + " item");

    }
}
