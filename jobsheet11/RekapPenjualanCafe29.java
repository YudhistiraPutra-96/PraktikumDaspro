package jobsheet11;

import java.util.Scanner;
public class RekapPenjualanCafe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Rekap Penjualan Cafe-------\n");

        System.out.print("Masukkan Jumlah Menu : ");
        int jmlmenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Hari : ");
        int jmlhari = sc.nextInt();

        int [][] penjualan = new int [jmlmenu][jmlhari];
        String [] menu = new String [jmlmenu];

        inputmenu(menu);
        inputdata(penjualan, menu);

        tampiltabel(penjualan, menu);
        menuterlaris(penjualan, menu);
        ratamenu(penjualan, menu);

        // String [] menu = {"Kopi", "Teh", "Es Kelapa Muda","Roti Bakar", "Gorengan"};
        // int [][] datamenu = new int [5][7];
        // int [][] datamenu = {
        //     {20,20,25,20,10,60,10},
        //     {30,80,40,10,15,20,25},
        //     {5,9,20,25,10,5,45},
        //     {50,8,17,18,10,30,6},
        //     {15,10,16,15,10,10,55},
        // };
        // inputdata(datamenu,menu);
        // menuterlaris(datamenu, menu);
    }

    static void inputdata(int[][]penjualan, String[]menu){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------Input Data Penjualan-------\n");

        for(int i = 0; i < penjualan.length; i++){
            System.out.println("\nMenu : "+ menu[i]);
            for(int j = 0; j < penjualan[i].length; j++){
                System.out.print("Hari "+(j+1)+" : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void inputmenu(String[]menu){
        Scanner sc = new Scanner (System.in);
        System.out.println("\n-------Input Nama Menu-------\n");

        for(int i = 0; i < menu.length; i++){
            System.out.print("Masukkan Nama Menu ke - "+ (i+1)+ " : ");
            menu[i] = sc.nextLine();
        }
    }

    static void tampiltabel(int[][]penjualan, String[]menu){
        System.out.println("\n-------Tabel Penjualan-------\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s","MENU/HARI");
        for(int j = 0; j < penjualan[0].length; j++){
            System.out.printf("%-15s","HARI KE- "+(j+1));
        }
      
        System.out.printf("%-10s %-15s\n","TOTAL","RATA-RATA");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

        for(int i = 0; i < penjualan.length; i++){
            System.out.printf("%-20s",menu[i]);
            int total = 0;

            for(int j = 0; j < penjualan[i].length; j++){
                total += penjualan[i][j];
                System.out.printf("%-15d",penjualan[i][j]);
            }
            double rata = (double) total/penjualan[i].length;
            System.out.printf("%-10d", total);
            System.out.printf("%-15.2f\n", rata);

        }
    
    }

    static void menuterlaris(int[][]penjualan, String[]menu) {
        int maxTotal = 0;
        String menuTerlaris = "";
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            
            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }
        
        System.out.println("\n-------MENU TERLARIS-------\n");
        System.out.println("Menu: " + menuTerlaris);
        System.out.println("Total Penjualan: " + maxTotal + " porsi");
    }

    static void ratamenu(int[][]penjualan, String[]menu){
        System.out.println("\n-------Rata-Rata Penjualan-------\n");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-10s\n","MENU", "TOTAL", "RATA-RATA");
        System.out.println("--------------------------------------------------------------------");

        for(int i = 0; i < penjualan.length; i++){
            int total = 0;
            for(int j = 0; j < penjualan[i].length;j++){
                total += penjualan[i][j];
            }
            double rata = (double) total/penjualan[i].length;
            System.out.printf("%-20s %-15d %-10.2f \n",menu[i], total, rata);
        }
    }
}
