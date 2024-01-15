package Day99;

import java.util.Scanner;

public class Soal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                total += i;
            }
        }

        System.out.println("Jumlah bilangan kelipatan 4 dari 1 hingga " + n + " adalah " + total);
    }
    
}
