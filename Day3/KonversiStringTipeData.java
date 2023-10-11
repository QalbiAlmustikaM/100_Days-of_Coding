
package Day3;

public class KonversiStringTipeData {
    public static void main(String[] args){
        //Konversi String ke Tipe Data Primitif\
        String angkaString ="123";
        int angkaInt = Integer.parseInt(angkaString);
        double angkaDouble = Double.parseDouble (angkaString);
        boolean booleanFromString = Boolean.parseBoolean("true");

        System.out.println("Konversi String ke Tipe Data Primitif:");
        System.out.println("angkaInt: " + angkaInt);
        System.out.println("angkaDouble: " + angkaDouble);
        System.out.println("booleanFromString: " + booleanFromString);
        
        //Konversi Tipe Data Primitif ke String
        int angka = 456;
        double doubleAngka = 789.123;
        boolean booleanValue = true;

        String angkaString2 = String.valueOf(angka);
        String doubleAngkaString = String.valueOf(doubleAngka);
        String booleanString = String.valueOf(booleanValue);

        System.out.println("\nKonversi Tipe Data Primitif ke String:");
        System.out.println("angkaString2: " + angkaString2);
        System.out.println("doubleAngkaString: " + doubleAngkaString);
        System.out.println("booleanString: " + booleanString);
        
    }
}
