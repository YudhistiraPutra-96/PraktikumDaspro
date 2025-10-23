package jobsheet7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tiket, hargatiket = 50000, totaltiket, totalharga1, totalharga, diskon, hargadiskon, totalPendapatan = 0; 
        int i = 1, totaltiketterjual = 0;
        String namapembeli = "";

    while (true){

    System.out.println("<> PELANGGAN KE - " + i);        
    System.out.println("Masukkan jumlah tiket yang ingin dibeli: ");
    tiket = sc.nextInt();

    i++;
          
           if (tiket > 10){
                totaltiket = tiket;
                totalharga = totaltiket * hargatiket;
                diskon = totalharga * 0.15;
                hargadiskon = totalharga - diskon;
                System.out.println("Total harga yang harus dibayar oleh " + namapembeli + " setelah diskon 15% adalah: Rp " + hargadiskon);
                totalPendapatan += hargadiskon;
                totaltiketterjual += totaltiket;
            } else if (tiket > 4){
                totaltiket = tiket;
                totalharga = totaltiket * hargatiket;
                diskon = totalharga * 0.1;
                hargadiskon = totalharga - diskon;
                System.out.println("Total harga yang harus dibayar oleh " + namapembeli + " setelah diskon 10% adalah: Rp " + hargadiskon);
                totalPendapatan += hargadiskon;
                totaltiketterjual += totaltiket;
            }  if(tiket <= 4 && tiket > 0){
                totaltiket = tiket;
                totalharga1 = totaltiket * hargatiket;
                System.out.println("Total harga yang harus dibayar oleh " + namapembeli + " adalah: Rp " + totalharga1);
                totalPendapatan += totalharga1;
                totaltiketterjual += totaltiket;
            } else if (tiket == 0){
                System.out.println("Semua transaksi selesai.");
                System.out.println();
                System.out.println("\n=== RINGKASAN TRANSAKSI ===");
                System.out.println("Jumlah pelanggan: " + (i-2));
                System.out.println("Jumlah tiket terjual: " + totaltiketterjual + " tiket");
                System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);

                break; 
            } else if (tiket < 0){
                System.out.println("Jumlah tiket tidak valid. Silahkan masukkan ulang!");
                i--;
                continue;
            }
        }
    }
}