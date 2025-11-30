package jobsheet11;

import java.util.Scanner;
public class NilaiMahasiswa29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Jumlah Mahasiswa-------\n");

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlmhs = sc.nextInt();

        double [] mahasiswa = new double [jmlmhs];

        // Memanggil isianArray
        isianArray(mahasiswa);
        // Memanggil tampilArray
        tampilArray(mahasiswa);

        double totalnilai = hitTot(mahasiswa);
        System.out.println("\n-------Total Nilai Mahasiswa-------");
        System.out.println("\nTotal nilai seluruh mahasiswa adalah : "+ totalnilai);
    }

    static void isianArray(double[]nilaiarray){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------Input Nilai-------\n");
        
        for(int i = 0; i < nilaiarray.length; i++){
            System.out.print("Masukkan nilai tiap mahasiswa : ");
            nilaiarray[i] = sc.nextInt();
        }
    }

    static void tampilArray(double[]nilaiarray){
        System.out.println("\n-------Nilai Mahasiswa-------\n");

        for(int i = 0; i < nilaiarray.length; i++){
            System.out.println((i+1)+". Nilai Mahasiswa "+(i+1)+" adalah " + nilaiarray[i]);
        }
    }

    static double hitTot(double[]nilaiarray){
        double total = 0;

        for(int i = 0; i < nilaiarray.length; i++){
            total += nilaiarray[i];
        }
        return total;
    }

}
