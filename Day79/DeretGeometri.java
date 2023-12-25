package Day79;

public class DeretGeometri {
    public static void main(String[] args) {
        // Deklarasi Variabel
        int n = 10;
        float a = 2;
        float r = 3;
        
        // Hitung Deret Geometri
        for (int i = 0; i < n; i++) {
            System.out.println(a*Math.pow(r,i) + "");
            
        }
    }
    
}
