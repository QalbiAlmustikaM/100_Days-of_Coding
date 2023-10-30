package Day22;

public class ForEachExample {
    public static void main(String[] args) {
        // Membuat Array integer
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Menggunakan Perulangan for-each
        for (int number : numbers) {
            System.out.println("Angka: " + number);
        }
    }
}
