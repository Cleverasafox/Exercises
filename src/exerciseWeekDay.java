import java.util.Scanner;

public class exerciseWeekDay {

    public static void main(String[] args) {


        int dayNumber;
        String daySuffix = "th";
        String dayOfWeek = null;
        Scanner sc = new Scanner(System.in);


        while(true) {
            System.out.println("Enter digit between 1-7");
            dayNumber =sc.nextInt();
            if(dayNumber>0 && dayNumber <=7){
                break;
            }
            System.out.println("Please try again with the correct input");
        }

        switch (dayNumber){

            case 1:

                dayNumber = 1;
                daySuffix = "-st";
                dayOfWeek = "Monday";
                        break;
            case 2:
                daySuffix = "-nd" ;
                dayOfWeek = "Tuesday";
                break;
            case 3:
                daySuffix = "rd";
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayNumber= 4;
                dayOfWeek = "Thursday";
                break;

            case 5:
                dayNumber= 5;
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayNumber= 7;
                dayOfWeek = "Sunday";

        }


    }
}
