package jobsheet9;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh tarik","Cappucino", "Chocolate Ice"};

        System.out.println("Masukkan nama menu yang ingin dipesan : ");
        String pesanan = sc.nextLine();
        boolean found = false;
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(pesanan)) {
                found = true;
                break;
            }else{
                found = false;
            }
        
        }
        if(found){
            System.out.println("Menu " + pesanan + " tersedia di restoran kami.");
        } else {
            System.out.println("Maaf, menu " + pesanan + " tidak tersedia di restoran kami.");
        }
    }
}
