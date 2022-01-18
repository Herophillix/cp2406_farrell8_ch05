import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userChoice;

        System.out.println("Select your condominium");
        System.out.println("1)Park view\n2)Golf course view\n3)Lake view");
        System.out.println("Input:");
        try {
            userChoice = scanner.nextInt();
        } catch (Exception e)
        {
            userChoice = 0;
        }

        int price;
        switch (userChoice)
        {
            case 1 -> price = 150000;
            case 2 -> price = 170000;
            case 3 -> price = 210000;
            default -> price = 0;
        }

        System.out.println("Select your parking space");
        System.out.println("1)Garage\n2)Parking space");
        System.out.println("Input:");
        System.out.println("Input:");
        try {
            userChoice = scanner.nextInt();
        } catch (Exception e)
        {
            userChoice = 0;
        }

        if (userChoice == 1) {
            price += 5000;
        }

        System.out.println("The price is $" + price);
    }
}