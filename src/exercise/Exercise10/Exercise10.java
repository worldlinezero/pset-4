package exercise.Exercise10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner favCity = new Scanner(System.in);
        System.out.print("What's your favorite city? ");
        String city = favCity.nextLine();
        int cityLength = city.length();
        String upperCity = city.toUpperCase();
        String lowerCity = city.toLowerCase();
        System.out.println("\n" + "Text : " + city);
        System.out.println("Length : " + cityLength);
        System.out.println("Uppercase : " + upperCity);
        System.out.println("Lowercase : " + lowerCity);
        favCity.close();
    }
}