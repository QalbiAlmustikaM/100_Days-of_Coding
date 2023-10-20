package Day12;


public class BilanganArmstrong {
    public static void main(String[] args) {
        int angka = 153;
        int jumlah = 0;
        int asli = angka;

        while (angka != 0) {
            int digit = angka % 10;
            jumlah += Math.pow(digit, 3);
            angka /= 10;
        }

        if (jumlah == asli) {
            System.out.println(asli + " adalah bilangan Armstrong.");
        } else {
            System.out.println(asli + " bukan bilangan Armstrong.");
        }
    }
    
}
