package Day42;

import java.util.Scanner;


public class KelipatanTiga {
    public static void main(String[] args) {
        // Membuat objek scanner untuk mengambil inputan pengguna
        Scanner Sc = new Scanner(System.in);
        
        //Menerima inputan Pengguna
        System.out.print("Masukkan Nilai : ");
        int Nilai = Sc.nextInt();
        
        // Memeriksa apakah nilai habis di bagi 3
        if (Nilai % 3 ==  0){
            
            System.out.println(Nilai + " Habis dibagi tiga");
        }else{
            System.out.println(Nilai + " Tidak habis dibagi tiga");
        }
        // Menutup objek Scanner
        Sc.close();
    }
    
}
