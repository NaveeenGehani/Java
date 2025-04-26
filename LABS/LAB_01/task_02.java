package LABS.LAB_01;
import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalInputs = 6;
        char [] letters = new char[totalInputs];

        // take 6 char inputs
        for(int i = 0; i < totalInputs; i++){
            System.out.print("Enter a single character: ");
            String input = sc.next();
            // Check only single char is entered.
            if(input.length() > 1){
                System.out.println("Please enter a single character!");
                i--;
                continue;
            }
            letters[i] = input.charAt(0);
        }

        // Reverse the array
        for(int i = 0; i < letters.length/2; i++){
            char temp = letters[i];
            letters[i] = letters[letters.length - 1 - i];
            letters[letters.length - 1 - i] = temp;
        }
        // Print the reversed array
        for(char letter : letters){
            System.out.print(letter + " ");
        }
        
        
        
    }
}