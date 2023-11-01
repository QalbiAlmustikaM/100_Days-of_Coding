package Day25;

public class Array {
    public static void main(String[] args) {
         // Deklarasi array integer
        int[] numbers = new int[5];

        // Inisialisasi array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Menampilkan array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
