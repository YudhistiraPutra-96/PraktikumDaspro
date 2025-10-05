package jobsheet5;
import java.util.Scanner;

public class Tugas2 {
static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
   System.out.println("Masukkan angka: ");
   int angka = sc.nextInt(); 
   
    if (angka % 2 == 0){
         System.out.println(angka + " adalah bilangan genap");
    }else{
         System.out.println(angka + " adalah bilangan ganjil");
    } 
    
   }                  
}
