package LABS.Lab_02;
import java.util.Scanner;


public class min_max_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter another number: ");
        int y = sc.nextInt();
        int maxValueIndicator = Integer.compare(x, y);
        switch (maxValueIndicator) {
            case -1:
                System.out.format("%d is maximum.\n", y);
                break;
            case 0:
                System.out.format("Both are equal\n");
                break;
            case 1:
                System.out.format("%d is maximum.\n", x);
                break;
            default:
                System.out.println("Unexpected comparison result");
                break;
            }
    }
    
}
