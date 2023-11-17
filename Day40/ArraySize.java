package Day40;

public class ArraySize {
    public static void main(String[] args) {
        int[] angkaArray = {1, 2, 3, 4, 5};
        int panjangArray = angkaArray.length;

        // Menampilkan hasil
        System.out.println("Isi array:");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print(angkaArray[i] + " ");
        }

        System.out.println("\nPanjang (size) array adalah: " + panjangArray);
    }
    
}
