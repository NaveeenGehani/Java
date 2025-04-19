package Chapter_01.Practice_Set;
import java.util.Scanner;

public class Java_Q4 {
    public static void main(String[] args) {
        System.out.println("Enter Kilometers");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km/1.609;
        System.out.println(miles);
    }   
}
