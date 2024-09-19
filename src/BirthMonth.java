import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        int birthMonth;

        System.out.println("Enter your birth month [1-12]");
        if (scan.hasNextInt()) { //Checking if the data type is an integer
            birthMonth = scan.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12) { //Checking if the birth month is between 1 and 12
                System.out.println("Your birth month is " + birthMonth);
            }
            else //If the birth month isn't between 1 and 12
            {
                System.out.println("You entered an invalid birth month of " + birthMonth);
                System.exit(0);
            }
        } else { //if the data type isn't an integer
            System.out.println("You entered an invalid data type");
            System.exit(0);
        }
    }
}