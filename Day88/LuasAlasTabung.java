package Day88;

import java.util.Scanner;

public class LuasAlasTabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Masukkan Jari-Jari (cm): ");
       double r = scanner.nextDouble();

       double L_alas;
       if (r % 7 == 0) {
           L_alas = (22.0 / 7) * r * r;
       } else {
           L_alas = 3.14 * r * r;
       }

       // Menyederhanakan hasil luas alas
       L_alas = Math.round(L_alas);

       // Membersihkan layar (tidak didukung secara langsung di Java)
       try {
           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
       } catch (Exception e) {
           System.out.println("Gagal membersihkan layar.");
       }

       // Menampilkan hasil
       System.out.println("Jari-jari Tabung\t: " + r + " cm");
       System.out.println("Luas Alas Tabung\t: " + L_alas + " cm²");
    }
    
}
