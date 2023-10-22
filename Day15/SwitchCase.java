package Day15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        // Menggunakan switch-case
        switch (nilai) {
            case 90:
                System.out.println("Nilai: " + nilai + ", Grade: A");
                break;
            case 80:
                System.out.println("Nilai: " + nilai + ", Grade: B");
                break;
            case 70:
                System.out.println("Nilai: " + nilai + ", Grade: C");
                break;
            default:
                System.out.println("Nilai: " + nilai + ", Grade: D");
        }
    }
}
