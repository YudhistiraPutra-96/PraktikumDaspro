package jobsheet8;
import java.util.Scanner;

public class NilaiKelompok29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1;
        double totalNilai;
        double rataNilai;
        double nilai;
        double maxRataNilai = 0;
        int kelompokTerbaik = 0;

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

            if (rataNilai > maxRataNilai) {
                maxRataNilai = rataNilai;
                kelompokTerbaik = i;
            }

            i++; 
        }
        
        System.out.println("\n=== HASIL TERBAIK ===");
        System.out.println("Kelompok dengan nilai rata-rata tertinggi: Kelompok " + kelompokTerbaik);
        System.out.println("Dengan nilai: " + maxRataNilai);
    }
}
