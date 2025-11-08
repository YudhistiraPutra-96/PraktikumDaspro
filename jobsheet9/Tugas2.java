package jobsheet9;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int totalharga = 0;

        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahpesanan = sc.nextInt();
        int jumlahharga = jumlahpesanan;
        String [] pesanan = new String [jumlahpesanan];
        int [] harga = new int [jumlahpesanan];
        sc.nextLine();

        for ( int i = 0; i < jumlahpesanan; i++){
            System.out.print("Masukkan pesanan ke-" + (i+1) + " : ");
            pesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i+1) + " : ");
            harga[i] = sc.nextInt();
            totalharga += harga[i];
            sc.nextLine();
            
        }

        System.out.println();
        System.out.println("Daftar pesanan Anda adalah sebagai berikut : ");
        for (int i = 0; i < jumlahpesanan; i++){
                System.out.println("Pesanan ke-" + (i+1) + " : " + pesanan[i] + " dengan harga Rp." + harga[i]);
        }
        System.out.println();
        System.out.println("Total harga pesanan Anda adalah Rp." + totalharga);

    }
    
}
