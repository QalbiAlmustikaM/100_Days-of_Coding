package Day91;

import java.util.Scanner;

public class LuasAlasTanung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jari-Jari (cm) : ");
        double r = input.nextDouble();

        int roundedR = (int) Math.round(r);  // Round r to nearest integer
        double L_alas;

        if (roundedR % 7 == 0) {
            L_alas = (22.0 / 7) * roundedR * roundedR;
        } else {
            L_alas = 3.14 * roundedR * roundedR;
        }

        int roundedL_alas = (int) Math.round(L_alas);  // Round L_alas to nearest integer
        
        System.out.printf("Jari-jari Tabung \t: %d cm\n", roundedR);
        System.out.printf("Luas Alas Tabung \t: %d cm²\n", roundedL_alas);
    }
    
}
