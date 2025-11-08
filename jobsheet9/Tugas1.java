package jobsheet9;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int total = 0;
        double ratatertinggi = 0;
        double rataterendah = 100;


        System.out.print("Masukkan banyak mahasiswa : ");
        int jumlahmhs = sc.nextInt();
        int [] nilai = new int [jumlahmhs];

        for ( int i = 0; i < jumlahmhs; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if(nilai[i] > ratatertinggi){
                ratatertinggi = nilai[i];
            }else if (nilai[i] < rataterendah){
                rataterendah = nilai[i];
            }    

        }
        
        double rata2 = total / jumlahmhs;
        System.out.println();
        System.out.println("Rata-rata nilai adalah : " + rata2);
        System.out.println("Nilai tertinggi adalah : " + ratatertinggi);
        System.out.println("Nilai terendah adalah : " + rataterendah);
        System.out.println();

        for (int i = 0; i < jumlahmhs; i++){
                System.out.println("Nilai yang telah dimasukkan adalah : " + nilai[i]);
        }
    }
}
