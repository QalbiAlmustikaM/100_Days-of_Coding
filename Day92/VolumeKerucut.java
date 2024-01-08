package Day92;

import java.util.Scanner;

public class VolumeKerucut {
    public static void main(String[] args) {
        final double PHI = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        int r = input.nextInt();

        System.out.print("Masukkan tinggi kerucut: ");
        int t = input.nextInt();

        double volume = 0.33 * PHI * r * r * t;

        System.out.println("Volume kerucut adalah: " + volume);
    }
    
}
