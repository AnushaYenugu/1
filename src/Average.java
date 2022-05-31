import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
       int a = 0;
       int b;
       int c;
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter irt number a ");
        a=scanner.nextInt();
        System.out.println("Enter econ number b ");
        b=scanner.nextInt();
        System.out.println("Enter third number c ");
        c=scanner.nextInt();
        Average obj = new Average();
        System.out.println("Average o the three number "+obj.average(a,b,c));

    }
    public int average(int a,int b,int c){
        int avg= (a+b+c)/3;
        return avg;
    }
}
