package jobsheet9;
import java.util.Scanner;

public class SearchNilai29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = 0;
        int hasil = -1;
        int banyaknilai;
        int i ;

        System.out.println("Masukkan banyaknya nilai yang akan diinput : ");
        banyaknilai = scanner.nextInt();

        int[] arrNilai = new int[banyaknilai];

        for (i = 0; i < banyaknilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");
            arrNilai[i] = scanner.nextInt();
            
            
            // if (key == arrNilai[i]) {
            //     hasil = i;
            //     break;
            // }
            
        
        // System.out.println();
        // System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        }// System.out.println();
        System.out.println("Masukkan nilai yang ingin dicari : ");
        key = scanner.nextInt();

        for(i = 0; i < banyaknilai; i++){
            if(key == arrNilai[i]){
                hasil = i;
                break;
            }
        }

        
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        
        }
    }
}
