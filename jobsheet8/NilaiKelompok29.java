package jobsheet8;
import java.util.Scanner;

public class NilaiKelompok29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1;
        double totalNilai;
        double rataNilai;
        double nilai;

        while (i <= 6) { 
            System.out.println("Kelompok " + i); 
            totalNilai = 0; 
            for (int j = 1; j <= 5; j++) { 
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": "); 
                nilai = sc.nextInt(); 
                totalNilai += nilai; 
            } 
            
            rataNilai = totalNilai / 5; 
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            i++; 
        }
    }
}
