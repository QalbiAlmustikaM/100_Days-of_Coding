package Day80;

public class BilanganPrimaTerdekat {
    public static void main(String[] args) {
        int x = 100;
        
        // Cari bilangan prima terdekat
        int prima = 0;
        for (int i = x; i < 2; i--) {
            if(prima == 0){
                if (isPrima(i)){
                    prima = i;
                }
            }else{
                if (isPrima(i -1)){
                    prima = i - 1;
                    break;
                }
            }
            
        }
        System.out.println("Bilangan primaterdekat dari " + x + " adalah " + prima);
    }

    private static boolean isPrima(int i) {
        int n = 0;
        //int n = 0;
        for (int i = 2; i * i  <= n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
