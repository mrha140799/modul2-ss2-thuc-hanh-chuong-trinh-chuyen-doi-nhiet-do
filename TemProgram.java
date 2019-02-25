package SS2TH1;

import java.util.Scanner;

public class TemProgram {
    public static void main(String[] args) {
        int choice ;
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("    ->Enter your choice: ");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    double fahrenheit = scn.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    float celsius = scn.nextFloat();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.out.println("See u late!");
                    System.exit(0);
            }
        }
    }

     static double celsiusToFahrenheit(float c) {
        double f = (c*1.8)+32;
        return f;
    }

    static float fahrenheitToCelsius(double f) {
        float c = (float) ((f-32)/1.8);
        return c;
    }

}
