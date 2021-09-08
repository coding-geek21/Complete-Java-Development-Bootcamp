import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, Thank you for taking the survey!");

        int counter = 0;
        System.out.println("\nWhat is your Name? ");
        String name = scan.nextLine(); // to get string value
        counter++;

        System.out.println("\nHow much money do you spend on buying books?");
        double bookPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy Fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy Books?");
        int bookAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
        System.out.println("Your fast food expenses are " + (foodAmount / bookAmount) + " times your book expenses.");
        System.out.println("Weekly, you spend Rs. " + (bookAmount * bookPrice) + " on Book");
        System.out.println("Weekly, you spend Rs. " + (foodAmount * foodPrice) + " on FastFood");

        scan.close();

    }

}
