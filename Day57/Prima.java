package Day57;

import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in); 
        int bilangan = 11;

        boolean prima = true;

        for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
                prima = false;
                break;
            }
        }

        if (prima) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
   
    }
}
