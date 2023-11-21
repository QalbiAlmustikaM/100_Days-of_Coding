package Day44;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = in.nextInt();

        // Membalikkan bilangan**
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        // Menentukan apakah bilangan tersebut adalah palindrome
        if (n == reverse) {
            System.out.println("Bilangan tersebut adalah palindrome");
        } else {
            System.out.println("Bilangan tersebut bukan palindrome");
        }
    }
    
}
