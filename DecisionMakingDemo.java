public class DecisionMakingDemo {
    public static void main(String[] args) {
        int number = 10;

        // if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // if-else-if ladder
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}