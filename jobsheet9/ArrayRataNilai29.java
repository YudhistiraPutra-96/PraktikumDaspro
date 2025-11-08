package jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiMhs = new int [10];
        double totalnilailulus = 0;
        double totalnilaitdklulus = 0;
        double rata2;
        int jumlahlulus = 0, jumlahtidakLulus = 0   ;
        int jumlahMhs;
        double rataLulus, rataTidakLulus;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMhs = sc.nextInt();


        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if(nilaiMhs[i] > 70){
                totalnilailulus += nilaiMhs[i];
                jumlahlulus++;
            } else {  
                totalnilaitdklulus += nilaiMhs[i];
                jumlahtidakLulus++;
        }
    }
        rataLulus = totalnilailulus / jumlahlulus;
        rataTidakLulus = totalnilaitdklulus / jumlahtidakLulus;
        
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
