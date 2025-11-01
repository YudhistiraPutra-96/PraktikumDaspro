package jobsheet8;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat = 0;
            String proses = "";
            
            // Inner loop untuk menghitung kuadrat dari 1 sampai i
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlahKuadrat += kuadrat;
                
                // Membuat string proses perhitungan
                if (j == 1) {
                    proses += kuadrat;
                } else {
                    proses += " + " + kuadrat;
                }
            }
            
            // Menampilkan hasil
            System.out.println("n = " + i + " -> jumlah kuadrat = " + proses + " = " + jumlahKuadrat);
        }
    }
}