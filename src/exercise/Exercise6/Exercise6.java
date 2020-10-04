package exercise.Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner rectMetrics = new Scanner(System.in);
        System.out.print("Length : ");
        float length = rectMetrics.nextFloat();
        System.out.print("Width : ");
        float width = rectMetrics.nextFloat();
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double diagonal = Math.sqrt((Math.pow(length, 2)) + Math.pow(width, 2));
        System.out.print("\n" + "Area : ");
        System.out.printf("%,.2f", area);
        System.out.print("\n" + "Perimeter : ");
        System.out.printf("%,.2f", perimeter);
        System.out.print("\n" + "Diagonal : ");
        System.out.printf("%,.2f", diagonal);
        rectMetrics.close();
    }
}