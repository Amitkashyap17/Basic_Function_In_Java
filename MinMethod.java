import java.util.Scanner;

public class MinMethod {
    static int minFunction(int n1, int n2){
        int min;
        if (n1>n2){
            min=n2;
        }else {
            min=n1;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number n1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number n2 : ");
        int b = sc.nextInt();
        int x = minFunction(a,b);
        System.out.println("Minimum Value is "+x);
    }
}
