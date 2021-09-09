public class LogicalOperators {
    public static void main(String[] args) {
        double price = 25.99;
        int quantity = 2;

        if (price >= 30 || quantity > 5) {
            System.out.println("If code runs");
        } else {
            System.out.println("Else code runs");
        }

        double price2 = 29.99;
        int quantity2 = 2;
        String item = "shirt";

        if (price2 <= 30 && quantity2 < 5 && item.equals("shirt")) {
            System.out.println("If code runs");
        } else {
            System.out.println("Else code runs");
        }
    }
}
