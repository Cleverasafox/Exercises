import java.util.Scanner;

public class VacationAdvisor {

    public static void main(String[] args) {
        String destination;
        double budget;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your daily budget:");
        budget = sc.nextDouble();
        while (true) {
            System.out.println("Please enter destination location. Mountain or Beach");

            destination = sc.next();
            if (destination.equals("Mountain") || destination.equals("Beach")) {
                break;
            }
            System.out.println("We do not have information about your destination , We only have information for Beach or Mountain");
        }

        System.out.println("You have entered: " + destination);

        if (destination.equals("Beach")) {
            if (budget < 50) {
                System.out.println("You should go to Bulgaria");
            } else {
                System.out.println("You should go outside Bulgaria");
            }
        }


        if (destination.equals("Mountain")) {
            if (budget < 30) {
                System.out.println("You should go to Bulgaria");
            } else
                System.out.println("You should go to Outside Bulgaria");
        }
    }

}

