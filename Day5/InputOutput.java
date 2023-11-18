package Day5;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        //Menampilkan output
        System.out.println("Anda memasukkan angka: " + angka);

        scanner.close();

    }
    
}
