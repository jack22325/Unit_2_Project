import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the first coordinate point");
        Scanner o = new Scanner(System.in);
        String firstCoordinate = o.nextLine();
        System.out.print("Enter the second coordinate point");
        Scanner t = new Scanner(System.in);
        String secondCoordinate = t.nextLine();
        int opening = firstCoordinate.indexOf("(");

        // Find the index of the
        int closing = firstCoordinate.indexOf(")");

        // Find the index of ,
        int comma = firstCoordinate.indexOf(",");

        // Get a substring of -1
        String firstX = firstCoordinate.substring(opening+1,comma);

        // Get a substring of 1
        String firstY = firstCoordinate.substring(comma+1,closing);

        int x = Integer.parseInt(firstX);
        int y = Integer.parseInt(firstY);

        int opening2 = secondCoordinate.indexOf("(");

        // Find the index of the
        int closing2 = secondCoordinate.indexOf(")");

        // Find the index of ,
        int comma2 = secondCoordinate.indexOf(",");

        // Get a substring of -1
        String secondX = secondCoordinate.substring(opening2+1,comma2);

        // Get a substring of 1
        String secondY = secondCoordinate.substring(comma2+1,closing2);

        int x2 = Integer.parseInt(secondX);
        int y2 = Integer.parseInt(secondY);
        LinearEquation equation = new LinearEquation(x, y, x2, y2);
        System.out.println("First pair: " + firstCoordinate);
        System.out.println("Second pair: " + secondCoordinate);
        System.out.println("Slope of line: " + equation.calculateSlope());
        System.out.println("Y-intercept: " + equation.yIntercept());
        System.out.println("Slope intercept form: " + equation.slopeInterceptForm());
        System.out.println("Distance between points: " + equation.calculateTotalDistance());
        System.out.print("Enter a third x value");
        Scanner v = new Scanner(System.in);
        String third = v.nextLine();
        double doubleThird = Double.parseDouble(third);
        double thirdOutput = equation.findOutputOfThirdValue(doubleThird);
        System.out.println("Third coordinate point: " + "(" + doubleThird + "," + thirdOutput + ")");
    }
}
