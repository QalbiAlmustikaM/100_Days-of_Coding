package Day62;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // Panjang password yang diinginkan
        int panjangPassword = 8; 
        String kumpulanKarakter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        char[] password = new char[panjangPassword];

        for (int i = 0; i < panjangPassword; i++) {
            int indexKarakter = random.nextInt(kumpulanKarakter.length());
            password[i] = kumpulanKarakter.charAt(indexKarakter);
        }

        System.out.println("Password Anda: " + new String(password));
    }
    
}
