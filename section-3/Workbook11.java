/**
 * Workbook11
 */
public class Workbook11 {
    public static void main(String[] args) {
        int day = 3;
        boolean holiday = true;

        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";

        if (holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 7 || day == 6) {
            System.out.println("it's the weekend, no work");
        } else {
            System.out.println("Wake up at 7:00 :( ");
        }

    }
}