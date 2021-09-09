import java.util.Scanner;

public class Delimiter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 integers on same line: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter 2 decimals on same line: ");
        double dec1 = scan.nextDouble();
        double dec2 = scan.nextDouble();

        System.out.println("Enter 2 texts on same line: ");
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println("Enter 2 long integers on same line: ");
        long lngnum1 = scan.nextLong();
        long lngnum2 = scan.nextLong();

        scan.close();

        System.out.println("\n Integers: " + num1 + " " + num2);
        System.out.println("\n Decimals: " + dec1 + " " + dec2);
        System.out.println("\n Texts: " + str1 + " " + str2);
        System.out.println("\n Big Integers: " + lngnum1 + " " + lngnum2);

    }
}
