public class Workbook8 {
    public static void main(String[] args) {
        double wallet = 100;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");

        if (wallet >= toyCar) {
            System.out.println("Sure!, pay for the toy Car");
        } else {
            System.out.println("Sorry, I only have " + wallet + " left.");
        }
        // if you have enough money
        // print: Sure!
        // pay for the toy car

        // else: Sorry, I only have <wallet> left.

        double amount = 89.99;
        double nike = 95.99; // run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        // if you have enough money

        if (amount >= nike) {
            System.out.println("Sure!, pay for the Nike shoes");
        } else {
            System.out.println("Sorry, I only have " + amount + " left.");
        }
        // print: Sure!
        // pay for the nike shoes

        // else: Sorry, I only have <wallet> left.
    }
}
