package jobsheet8;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Masukkan nilai n: ");
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println("Nilai n minimal harus 3!");
            return;
        }    
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Jika di border/tepi, cetak angka n
                // Jika di tengah, cetak spasi (bolong)
                 if (i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  "); // 2 spasi untuk alignment
                } 
            }
            System.out.println();
        }
    }   
}
