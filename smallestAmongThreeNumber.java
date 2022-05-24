import java.util.Scanner;

public class smallestAmongThreeNumber {
    static void smallestNumber(int a, int b, int c){
        if(a<b&&a<c){
            System.out.println(a+" is smallest.");
        } else if (b<c)
        {
            System.out.println(b+" is smallest.");
        }else {
            System.out.println(c+" is smallest.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter a number : ");
        int n3 = sc.nextInt();
        smallestNumber(n1,n2,n3);
    }
}
