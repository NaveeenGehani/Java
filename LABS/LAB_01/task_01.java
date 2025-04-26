package LABS.LAB_01;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        int [] numbers = {0,1,2,3,4,5,6,7,8,9,11,22,25,32,33,44,47,55,66,77,88,99};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the element you want to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i : numbers){
            if(i == search)
            {
                found = true;
                break;
            }
            else
            {
                found = false;
            }
        }
        if(found)
            System.out.println("Found!");
        else{
            System.out.println("Not Found!");
        }
    }
}
