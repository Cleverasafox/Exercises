import java.util.Scanner;

public class AgeValidator {

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        age = sc.nextInt();

        if(age<16){
            System.out.println("You are not eligible to work");
        }else {
            System.out.println("You are eligible to work");
        }

    }
}
