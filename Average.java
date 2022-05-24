import java.util.Scanner;

public class Average {
    static double averageThreeNumber(double a, double b,double c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        double avg = averageThreeNumber(12,20,20);
        System.out.print("The average value is ");
        System.out.format("%.2f",avg);
    }
}
