import java.util.Scanner;

public class Workbook13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        // Task 1 - Pick up the user's decision.
        String decision = scan.nextLine();

        switch (decision) {
            case "yes":
                System.out.println("\nGreat! In one line" + "\nHow much money do you have in your savings?"
                        + "\nAnd, how much do you owe in credit card debt?");
                int savings = scan.nextInt();
                int debt = scan.nextInt();
                System.out.println("\nHow many years have you worked for?");
                int yrs = scan.nextInt();
                scan.nextLine();
                System.out.println("What is your name?");
                String name = scan.nextLine();
                if (savings >= 10000 && debt < 5000 && yrs > 2) {
                    System.out.println("Congratulations " + name + " you have been approved!");
                } else {
                    System.out.println("Sorry, you are not eligible for a mortgage");
                }

                break;
            case "no":
                System.out.println("\nOK. Have a nice day!");
                break;
            default:
                System.out.println("\nOK. Have a nice day!");

        }

        // Task 2 - Print this if the decision is "yes"

        // Task 3 - Pick up each value
        // Task 4 - Pick up number of years

        // Task 5 - Pick up the user's name

        // Task 6 - Approve the mortgage if they meet the requirements (see article)
        // - Otherwise, don't give them a mortgage.

        // Task 2 - Print this if the decision was not "yes"

        scan.close();
    }
}
