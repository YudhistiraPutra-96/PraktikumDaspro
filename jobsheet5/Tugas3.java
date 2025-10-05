package jobsheet5;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pengguna;
        int sks;

        System.out.println("--- WiFi Kampus---");
        System.out.print("Masukkan jenis pengguna (Mahasiswa/Dosen): ");
        pengguna = scanner.nextLine();

        if(pengguna.equalsIgnoreCase("dosen")){
            System.out.println("Akses Wifi diberikan (dosen)");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            sks = scanner.nextInt();

            if (sks >= 12) {
                System.out.println("Akses Wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }


        } else {
            System.out.println("Jenis pengguna tidak valid");
        }
       
        scanner.close();
    }
}