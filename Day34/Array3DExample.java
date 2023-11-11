package Day34;

public class Array3DExample {
    public static void main(String[] args) {
        // Mendefinisikan array 3D
        int[][][] array3D = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}}
        };

        // Menampilkan elemen array 3D
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
