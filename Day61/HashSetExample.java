package Day61;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Menambahkan elemen
        fruits.add("Aggur");
        fruits.add("Pisang");
        fruits.add("Mangga");
        fruits.add("Jeruk");

        // Mengecek apakah elemen ada di HashSet
        boolean isApplePresent = fruits.contains("Anggur");
        System.out.println("Apakah Anggur ada dalam HashSet? " + isApplePresent);

        // Menghapus elemen
        fruits.remove("Jeruk");

        // Mencetak isi HashSet
        System.out.println("Isi HashSet: " + fruits);
    }
}
