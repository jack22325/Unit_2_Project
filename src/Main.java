import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the first coordinate point");
        Scanner o = new Scanner(System.in);
        String firstCoordinate = o.nextLine();
        System.out.println("First Pair: " + firstCoordinate);
        System.out.print("Enter the second coordinate point");
        Scanner t = new Scanner(System.in);
        String secondCoordinate = t.nextLine();
        System.out.println("Second Pair: " + secondCoordinate);
        int opening = firstCoordinate.indexOf("(");

        // Find the index of the )
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

        // Find the index of the )
        int closing2 = secondCoordinate.indexOf(")");

        // Find the index of ,
        int comma2 = secondCoordinate.indexOf(",");

        // Get a substring of -1
        String secondX = secondCoordinate.substring(opening+1,comma);

        // Get a substring of 1
        String secondY = secondCoordinate.substring(comma+1,closing);

        int x2 = Integer.parseInt(secondX);
        int y2 = Integer.parseInt(secondY);
        LinearEquation equation = new LinearEquation(x,y,x2,y2);
        System.out.println(equation.calculateYDistance());
    }
}
