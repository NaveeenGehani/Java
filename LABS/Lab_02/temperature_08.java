package LABS.Lab_02;
import java.util.Scanner;

public class temperature_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature to get the suitable activity: ");
        int temp = sc.nextInt();
        if(temp >= 80 && temp < 95){
            System.out.println("Swimming");
        }else if(temp >= 60 && temp < 80){
            System.out.println("Tennis");
        }else if (temp >= 40 && temp < 60) {
            System.out.println("Golf");
        }else if(temp >= 20 && temp < 40){
            System.out.println("Skiing");
        }
        else if (temp < 20 || temp > 95){
            System.out.println("Visit our shops!");
        }
    }
}
