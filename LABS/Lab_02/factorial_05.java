package LABS.Lab_02;
import java.util.Scanner;

public class factorial_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int n = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= n; i++){
            if(n > 0){
                    result *= i;
            }else{
                System.out.println("Value is Invalid!");
            }
        }
        System.out.format("The value of %d! is %d.", n, result);
    }
}
