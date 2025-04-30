package LABS.Lab_02;
import java.util.Scanner;

public class table_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.format("%d x %d = %d\n", number, i, (number * i));
        }
    }
}