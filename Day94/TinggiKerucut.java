package Day94;

import java.util.Scanner;

public class TinggiKerucut 
    {public static void main(String[] args) {
        final double PHI = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Cari jari-jari");
        System.out.println("2. Cari tinggi");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Masukkan volume kerucut: ");
            double volume = input.nextDouble();

            System.out.println("Masukkan tinggi kerucut: ");
            int t = input.nextInt();

            double r = Math.sqrt(3 * volume / (PHI * t));

            System.out.println("Jari-jari kerucut adalah: " + r);
        } else if (pilihan == 2) {
            System.out.print("Masukkan volume kerucut: ");
            double volume = input.nextDouble();

            System.out.print("Masukkan jari-jari kerucut: ");
            int r = input.nextInt();

            double t = 3 * volume / (PHI * r * r);

            System.out.println("Tinggi kerucut adalah: " + t);
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
    
}
