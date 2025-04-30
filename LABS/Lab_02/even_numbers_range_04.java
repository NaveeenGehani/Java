package LABS.Lab_02;
import java.util.Scanner;

public class even_numbers_range_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenCount = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 ==0){
                evenCount++;
            }
        }
        System.out.format("Total even numbers upto %d: %d", n, evenCount);
    }
    
}
