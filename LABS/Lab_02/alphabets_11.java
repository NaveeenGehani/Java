package LABS.Lab_02;
import java.util.Scanner;

public class alphabets_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        char alphabet = sc.nextLine().toLowerCase().charAt(0);
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("\"" + alphabet + "\"" +" is a vowel");
                break;
            default:
                if(Character.isLetter(alphabet)){
                    System.out.println("\"" + alphabet + "\"" + " is a consonant");
                }else{
                    System.out.println("Invalid Character!");
                }
                break;
        }
        sc.close();
    }
}
