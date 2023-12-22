package Day74;

import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();
            
            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();
            
            System.out.print("Pilih operasi (+, -, *, /): ");
            char operator = input.next().charAt(0);
            
            double hasil;
            
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    hasil = angka1 / angka2;
                    break;
                default:
                    System.out.println("Operasi tidak valid");
                    return;
            }
            
            System.out.println("Hasil: " + hasil);
        }
    }

}
