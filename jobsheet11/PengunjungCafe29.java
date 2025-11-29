package jobsheet11;

public class PengunjungCafe29 {
   static void daftarPengunjung(String... namePengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for(int i = 0; i < namePengunjung.length; i++) {
            System.out.println("- " + namePengunjung[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    } 
}
