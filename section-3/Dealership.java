import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");

        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your Budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is Available");
                    System.out.println("\n Do you have Insurance ? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\n Do you have Driving License ? Write 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("\n What is your Credit Score? ");
                    int credit = scan.nextInt();
                    if (license.equals("yes") && insurance.equals("yes") && credit > 660) {
                        System.out.println("Sold! Pleasure doing business with you!!");

                    } else {
                        System.out.println("We're sorry. You are not eligible");

                    }

                } else {
                    System.out.println("We Don't Sell cars under $10,000. Sorry!");
                }
                break;
            case "b":
                System.out.println("\nWhat is your car value at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your Selling price?");
                int price = scan.nextInt();
                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car, Pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, We're not Interested!");
                }
                break;
            default:
                System.out.println("Invalid option!");
        }

        scan.close();
    }
}
