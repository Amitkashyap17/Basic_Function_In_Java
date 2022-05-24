import java.util.Scanner;

public class Swapping {
    static void swappingFunction(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping number "+a+" "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number n2 : ");
        int n2 = sc.nextInt();
        swappingFunction(n1,n2);
    }
}
