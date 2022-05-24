import java.util.Scanner;

public class Vote {
    static void votingAge(int age){
        if (age>18){
            System.out.println("Eligible for vote");
        }else {
            System.out.println("Not Eligible for vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell me Your age : ");
        int x = sc.nextInt();
        votingAge(x);
    }
}
