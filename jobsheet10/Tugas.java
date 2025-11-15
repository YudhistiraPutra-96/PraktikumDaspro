package jobsheet10;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        String [] pertanyaan = new String [6];
        pertanyaan[0] = "Apakah anda puas dengan layanan yang diberikan oleh pegawai kami ? ";
        pertanyaan[1] = "Apakah anda puas dengan kebersihan fasilitas kami ? ";
        pertanyaan[2] = "Apakah anda puas dengan kecepatan pelayanan kami ? ";
        pertanyaan[3] = "Apakah anda puas dengan kualitas produk kami ? ";
        pertanyaan[4] = "Apakah anda puas dengan harga yang kami tawarkan ? ";
        pertanyaan[5] = "Apakah anda puas dengan kenyamanan tempat kami ? ";

        int [][] responden = new int [10][6];

       
        System.out.println("Berikan penilaian antara 1 sampai 5 untuk pertanyaan berikut:");
        System.out.println("Skala penilaian: 1=Sangat Tidak Puas, 2=Tidak Puas, 3=Cukup, 4=Puas, 5=Sangat Puas");

        for (int i = 0; i < responden.length; i++){
            System.out.println("\nRESPONDEN KE - " + (i+1));
            total = 0;
            for (int j = 0; j < responden[i].length; j++){
                System.out.print("Pertanyaan ke - " + (j+1) + " : ");
                System.out.println(pertanyaan[j]);
                System.out.print("Jawaban: ");
                responden[i][j] = sc.nextInt();
                total += responden[i][j];
            }
            System.out.println("\nRata-rata jawaban responden ke-" + (i+1) + " : " + total/responden[i].length);
            sc.nextLine();
        }
        System.out.println("\n==============================================================================");
        System.out.println("Rata-rata jawaban untuk setiap pertanyaan dan rata-rata keseluruhan adalah : \n");
        for (int j = 0; j < pertanyaan.length; j++){
            total = 0;
            for (int i = 0; i < responden.length; i++){
                total += responden[i][j];
            }
            System.out.println("Pertanyaan ke-" + (j+1) + " : " + pertanyaan[j]);
            System.out.println("Rata-rata jawaban: " + total/responden.length + "\n");
        }
        System.out.print("Rata-rata keseluruhan jawaban semua responden : ");
        total = 0;
        for (int i = 0; i < responden.length; i++){
            for (int j = 0; j < responden[i].length; j++){
                total += responden[i][j];
            }
        }System.out.println(total/(responden.length * pertanyaan.length));
        System.out.println( );
    }
}
