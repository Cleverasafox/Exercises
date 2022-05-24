import java.util.Scanner;

public class exerciseBuildaTriangle {

    public static void main(String[] args) {

        double angleA,angleB,angleC,sumAngles;

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("add angleA:");
            angleA = sc.nextDouble();
            if (angleA > 0 && angleA < 180) {
                break;
            }
            System.out.println("Please enter a valid angle input");

        }
        while (true){
            System.out.println("Add angleB:");
            angleB = sc.nextDouble();
            if (angleB > 0 && angleB < 180){
                break;
            }
            System.out.println("Please enter a valid angle input");
        }
        while (true){
            System.out.println("Add angleC:");
            angleC =sc.nextDouble();
                if (angleC > 0 && angleC < 180) {
                    break;
                }
            System.out.println("Please enter a valid angle input");
        }


        sumAngles = angleA+angleB+angleC;

        if (sumAngles == 180){
            System.out.println("The Triangle is possible");
        }else{
            System.out.println("The triangle is not possible");
        }

        if((angleA == angleB) || (angleA == angleC) && ((angleA < 90) && (angleB < 90) && (angleC <90))){
            System.out.println("Your triangle is isosceles and acute.");
        }
        if ((angleA == angleB) && (angleB == angleC) && (sumAngles == 180)) {
            System.out.println("Your triangle is equilateral and also acute. ");
        }
        if (angleA == 90 || angleB == 90 || angleC == 90) {

            System.out.println("Your triangle is right angled.");
        }
        if ((angleA > 90 || angleB > 90 || angleC> 90) && (sumAngles == 180)){
            System.out.println("Your triangle is obtuse");
        }
        if ((angleA < 90 && angleB < 90 && angleC < 90) &&(sumAngles == 180)) {
            System.out.println("Your triangle is acute");
        }else if(sumAngles == 180){

            System.out.println("Your triangle is multifaceted");
        }

    }
}
