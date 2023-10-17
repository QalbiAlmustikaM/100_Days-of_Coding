package Day9;

public class Logika {
    public static void main(String[] args) {

        // Operator AND
        int a = 10;
        int b = 20;
        boolean c = a < b && b < 30;
        System.out.println(c); 

        // Operator OR
        c = a < b || b < 30;
        System.out.println(c); 

        // Operator NOT
        c = !c;
        System.out.println(c); 

        // Operator XOR
        c = a < b ^ b < 30;
        System.out.println(c); 
        
    }
}
