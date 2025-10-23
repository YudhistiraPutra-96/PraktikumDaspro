package jobsheet7;

import java.util.Scanner;

public class SiakadFor29 {
    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
