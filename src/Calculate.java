import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        Calculate cali= new Calculate();
        int a;
        int b;
        Scanner scanner= new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("Addition of two numbers "+cali.add(a,b));
        System.out.println("Substraction of two numbers "+cali.sub(a,b));
        System.out.println("Multiplication of two number "+cali.multi(a,b));
        System.out.println("Division of two numbers "+cali.div(a,b));

    }
    public int add(int a, int b){
        int addition = a+b;
        return addition;
    }
    public int sub(int a, int b) {
        int substraction = a - b;
        return substraction;
    }
    public int multi(int a, int b){
        int multiplication= a*b;
        return multiplication;
    }
    public int div(int a, int b){
        int divison= a/b;
        return divison;

    }
}
