package Practice_Set;
import java.util.Scanner;

public class Java_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter Marks : ");
        marks = sc.nextInt();
        float percent = ( (float) marks/100) * 100;
        System.out.println("The Percentage is " + percent + "%");
    }
}
