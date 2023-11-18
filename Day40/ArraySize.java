package Day40;

public class ArraySize {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int panjangArray = (array.length);
        
        
        System.out.println("Tampilkan Array: ");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print(array[i] + " ");
            
        }
        System.out.println("\n panjang (zise) array adalah " + panjangArray);
        
        
    }
    
}
