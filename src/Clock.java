import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        System.out.println("Enter the time in seconds");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();


        if(time>0) {
            int seconds = time % 60;
            int hours = time / 60;
            int minutes = hours % 60;
            hours=hours/60;
            System.out.println("Expected output: " + hours + ":" + minutes + ":" + seconds);
        }
    }
}
