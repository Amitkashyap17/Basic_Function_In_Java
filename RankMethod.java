import java.util.Scanner;

public class RankMethod {
    static void rankFunction(int a){
        if (a>90){
            System.out.println("Rank : A1");
        } else if (a>80&&a<=90) {
            System.out.println("Rank : A2");
        }else {
            System.out.println("Rank : A3");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score : ");
        int x = sc.nextInt();
        rankFunction(x);
    }
}
