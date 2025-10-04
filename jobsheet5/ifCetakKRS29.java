package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS29 {
static Scanner sc = new Scanner(System.in);
boolean uktLunas;
public static void main(String[] args) {
    System.out.println("--- Cetak KRS SIAKAD---");
    System.out.println("Apakah UKT sudah lunas? (true/false)");
    boolean uktLunas = sc.nextBoolean();

    if (uktLunas){
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    }

}
}
