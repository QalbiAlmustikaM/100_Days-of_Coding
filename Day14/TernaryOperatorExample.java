package Day14;

import java.util.Scanner;


public class TernaryOperatorExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        System.out.print("Masukkan Angka:");
        int angka = input.nextInt();
        
        
        String hasil = (angka % 2 == 0) ? "genap" : "Ganjil";
        System.out.println("Angka " + angka + " Adalah bilangan " + hasil);
        
    }
}
    
    