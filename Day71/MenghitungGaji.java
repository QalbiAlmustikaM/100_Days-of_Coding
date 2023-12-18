package Day71;

import java.util.Scanner;

public class MenghitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja per minggu: ");
        int jamKerja = input.nextInt();
        System.out.print("Masukkan upah per jam: ");
        int upahPerJam = input.nextInt();
        int gaji = jamKerja * upahPerJam;
        System.out.println("Gaji yang diterima adalah: " + gaji);
    }
}
  
