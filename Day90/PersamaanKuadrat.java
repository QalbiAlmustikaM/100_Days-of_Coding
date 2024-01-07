package Day90;

import java.util.Scanner;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Java Mencari Akar Persamaan Kuadrat");
        System.out.println();
        System.out.println("Format persamaan: ax^2 + bx + c = 0");

        System.out.print("Input nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Input nilai b: ");
        int b = scanner.nextInt();

        System.out.print("Input nilai c: ");
        int c = scanner.nextInt();
        System.out.println();

        double D = (b * b) - (4 * a * c);
        System.out.print("Diskriminan = " + D);

        if (D > 0) {
            System.out.println(" (akar real dan berbeda)");
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + Math.round(x1 * 100.0) / 100.0);
            System.out.println("x2 = " + Math.round(x2 * 100.0) / 100.0);
        } else if (D == 0) {
            System.out.println(" (akar real dan sama)");
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = x2 = " + Math.round(x1 * 100.0) / 100.0);
        } else {
            System.out.println(" (akar tidak real / imajiner)");
        }
    }
}
