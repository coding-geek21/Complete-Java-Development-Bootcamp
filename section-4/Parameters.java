import java.util.Scanner;

public class Parameters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and width of the Rectangle: ");
        double length = scan.nextDouble();
        double width = scan.nextDouble();

        calculateArea(width, length);
        scan.close();

    }

    public static void calculateArea(double width, double length) {
        System.out.println("Width: " + width + " " + "  Length: " + length);
        System.out.println("Area of Rectangle: " + (length * width));
    }
}
