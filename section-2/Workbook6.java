import java.util.Scanner;

public class Workbook6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        // Task 1 - Using Scanner, ask the user questions

        // Ask for their first name.
        System.out.println("\n What is Your Firstname?");
        String fname = scan.nextLine();

        // Ask for their last name.
        System.out.println("\n What is Your LastName?");
        String lname = scan.nextLine();

        // Ask: how old are you?
        System.out.println("\n How old are you?");
        int age = scan.nextInt();

        // Ask them to make a username.

        System.out.println("\n Create your username: ");
        var userName = scan.nextLine();

        // Ask what city they live in.

        System.out.println("\n City you live in?");
        String city = scan.nextLine();

        // Ask what country that's from.

        System.out.println("\n You are from which country?");
        String country = scan.nextLine();

        // Task 2 - Print their information.

        System.out.println("Thank you for joining JavaGram!");

        // Print their information like so:

        System.out.println("\nYour information:");
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Age: " + age);
        System.out.println("Username: " + userName);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);

        scan.close();
        // close scanner. It's good practice :D !
    }
}
