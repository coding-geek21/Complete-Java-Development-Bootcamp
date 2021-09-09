import java.util.Scanner;

public class ReturnValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and width of the Rectangle: ");
        double length = scan.nextDouble();
        double width = scan.nextDouble();
        double res = calculateArea(width, length);
        System.out.println("Width: " + width + " " + "  Length: " + length);
        System.out.println("Area of Rectangle: " + res);

        scan.close();

    }

    public static double calculateArea(double width, double length) {
        double area = length * width;
        return area;
    }
}
