import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int input = scanner.nextInt();

        System.out.println(input + " is " + (input % 2 == 0 ? "even" : "odd"));
    }
}