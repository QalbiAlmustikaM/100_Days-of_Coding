package Day93;

import java.util.Scanner;

public class LuasPermukaanKerucut {
    public static void main(String[] args) {
        final double PHI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jari-jari kerucut: ");
        int r = input.nextInt();

        System.out.println("Masukkan tinggi kerucut: ");
        int t = input.nextInt();

        double luasAlas = PHI * r * r;
        double luasSisi = PHI * r * Math.sqrt(r * r + t * t);
        double luasTotal = luasAlas + luasSisi;

        System.out.println("Luas permukaan kerucut adalah: " + luasTotal);
    }
}
