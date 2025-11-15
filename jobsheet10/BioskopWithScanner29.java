package jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] penonton = new String [4][2];
        String nama;
        int baris, kolom;
        String next = "";
        int pilihan;
        

        while (true) {
            System.out.println("=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if(pilihan == 1){
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                

                while (true) {    
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    if (baris < 1 || baris > 4) {
                    System.out.println("Baris tidak tersedia, Masukkan baris antara 1-4");
                    continue;
                    }
                    break;
                }

                while (true) {
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    if (kolom < 1 || kolom > 2) {
                        System.out.println("Kolom tidak tersedia, Masukkan kolom antara 1-2");
                        continue;
                    }break;                
                }sc.nextLine();

                if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Kursi telah terisi oleh penonton lain");
                    continue;
                }    
                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }


            }if (pilihan == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i+1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***");
                        } else {
                            System.out.print(penonton[i][j]);
                        }
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            

            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi bioskop.");
                break;
            }
        }            
    }
}
