package Day60;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = SC.nextDouble();

        double fahrenheit = konversiCelciusToFahrenheit(celcius);
        double kelvin = konversiCelciusToKelvin(celcius);

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam Kelvin: " + kelvin);
    }

    private static double konversiCelciusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    private static double konversiCelciusToKelvin(double celcius) {
        return celcius + 273.15;
    }
    
}
