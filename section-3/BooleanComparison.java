public class BooleanComparison {
    public static void main(String[] args) {
        Boolean comparison1 = 8 > 9;
        Boolean comparison2 = -8 < -1;

        System.out.println("8 > 9 = " + comparison1);
        System.out.println("-8 > -1 = " + comparison2);

        double dob1 = 89.76;
        double dob2 = 12.9897;

        System.out.println(dob1 + " <= " + dob2 + " - " + (dob1 <= dob2));
        System.out.println(dob1 + " >= " + dob2 + " - " + (dob1 >= dob2));

        long lng1 = 8997080809L;
        long lng2 = 8997080809L;

        System.out.println(lng1 + " == " + lng2 + " - " + (lng1 == lng2));
        System.out.println(lng1 + " != " + lng2 + " - " + (lng1 != lng2));

        String st1 = "Hello World!";
        String st2 = "How are you?";
        String st3 = "Hello World!";

        System.out.println(st1 + " 'equals' " + st3 + " - " + st1.equals(st3));
        System.out.println(st1 + " 'not equals' " + st2 + " - " + st1.equals(st2));
        System.out.println(st1 + " 'not equals' " + st2 + " - " + !st1.equals(st2));

    }
}
