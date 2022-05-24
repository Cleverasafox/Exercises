import java.util.Scanner;

public class StoreDiscountValidator {
    public static void main(String[] args) {
        double price;
        int quantity;
        double discount;
        double revenue;
        double discountRevenue;

        Scanner sc = new Scanner(System.in);

        System.out.println("PLease enter unit price:");
        price = sc.nextDouble();

        System.out.println("Please enter quantity:");
        quantity = sc.nextInt();
        if(quantity>120){
            discount = 20;
        } else if (quantity>=100 && quantity <=120) {
            discount = 15;
        }else {
            discount = 0;
        }
        revenue = (price * quantity);
        discountRevenue = (discount/100)*revenue ;
        System.out.println("The revenue from your sale is:" + (revenue - discountRevenue));
        System.out.println("The discount from the sale is:" + discountRevenue + "("  + ((discount))+"%)");

    }
}
