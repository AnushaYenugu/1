import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("Enter user name ");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("Hello "+ name);
    }
}
