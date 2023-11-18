package Day41;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();
        // Menambahkan 
        buah.add("apel");
        buah.add("semangka");
        buah.add("jeruk");
        
        // Menghapus
        buah.remove("jeruk");
        
        System.out.println("Buah-buahan yang ada:");
        for (String namaBuah : buah) {
            System.out.println(namaBuah);
        }
    }
}
    