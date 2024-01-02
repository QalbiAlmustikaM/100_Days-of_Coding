package Day86;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Masukkan angka: ");
       int n = scanner.nextInt();

       for (int i = 0; i < n; i++) {
           // Print spaces for the upper triangle
           for (int j = 0; j < n - i - 1; j++) {
               System.out.print("  "); // Print two spaces for better alignment
           }
           // Print stars for the upper triangle
           for (int j = 0; j < 2 * i + 1; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }

       for (int i = n - 1; i > 0; i--) {
           // Print spaces for the lower triangle
           for (int j = 0; j < n - i; j++) {
               System.out.print("  "); // Print two spaces for better alignment
           }
           // Print stars for the lower triangle
           for (int j = 0; j < 2 * i - 1; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
