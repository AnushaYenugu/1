import java.util.Scanner;

public class Heowor {
    public static void main(String[] args) {
        //System.out.println();
        int year;

        Scanner ye = new Scanner(System.in);
        year =ye.nextInt();
        if (year % 4==0) {
            System.out.println("It’s leap year");
        }
        else
            System.out.println("It’s not");
        System.out.println("Hello \nAnusha!");
    }
}
