package LABS.Lab_02;

public class print_even_numbers_01 {
    public static void main(String[] args) {
        System.out.println("Method 1:");
        evenNumsByMultplication();
        System.out.println("Method 2:");
        evenNumsByCheck();
    }
    // Method 1
    public static void evenNumsByMultplication(){
        for(int i = 1; i <= 10; i++){
            System.out.println("  " + i * 2);
        }   
    }
    // Method 2
    public static void evenNumsByCheck(){
        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println("  " + i);
            }
        }
    }
}

