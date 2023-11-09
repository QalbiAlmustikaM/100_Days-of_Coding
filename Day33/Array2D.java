package Day33;

public class Array2D {
    public static void main(String[] args) {
   // Deklarasi array 2D
        int[][] numbers = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Tampilkan array 2D
        for (int[] row : numbers) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    
}
