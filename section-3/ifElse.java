import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your marks: ");

        int marks = scan.nextInt();

        if (marks >= 80) {
            System.out.println("Great job, You've Got A grade!");
        } else if (marks >= 70) {
            System.out.println("You've got B grade!");
        } else if (marks >= 60) {
            System.out.println("You've got C grade!");
        } else if (marks >= 60) {
            System.out.println("You've got D grade!");
        } else {
            System.out.println("Study Hard and better try Next time");

        }

        scan.close();
    }
}
