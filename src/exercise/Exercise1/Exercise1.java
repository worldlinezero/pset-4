package exercise.Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner atmosConditions = new Scanner(System.in);
        System.out.println("Temperature :");
        float temperature = atmosConditions.nextFloat();
        System.out.println("Wind speed :");
        float windSpeed = atmosConditions.nextFloat();
        double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
        System.out.print("Wind chill : ");
        System.out.printf("\n%,.2f", windChill);
        atmosConditions.close();
    }
}
