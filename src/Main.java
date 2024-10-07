import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the first coordinate point");
        Scanner o = new Scanner(System.in);
        String firstCoordinate = o.nextLine();
        System.out.println("First Pair: " + firstCoordinate);
        System.out.println("Enter the second coordinate point");
        Scanner t = new Scanner(System.in);
        String secondCoordinate = t.nextLine();
        System.out.println("Second Pair: " + secondCoordinate);
        int xCoord1 = Integer.parseInt(firstCoordinate.substring(1, firstCoordinate.indexOf(",")));
        int xCoord2 = Integer.parseInt(firstCoordinate.substring(firstCoordinate.indexOf("," + 1), firstCoordinate.indexOf(")"+1)));
        int yCoord1 = Integer.parseInt(secondCoordinate.substring(1, secondCoordinate.indexOf(",")));
        int yCoord2 = Integer.parseInt(secondCoordinate.substring(secondCoordinate.indexOf("," + 1), secondCoordinate.indexOf(")"+1)));
        LinearEquation equation = new LinearEquation(xCoord1, yCoord1, xCoord2, yCoord2);
        System.out.println("Slope of line: " + equation.calculateSlope());

    }
}
