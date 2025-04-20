package Practice_Set;

public class Java_Q2 {
    public static void main(String[] args) {
         char grade = 'C';
         grade = (char)(grade + 9);
         System.out.println("The grade after being encrypted : " + grade); // Prints L
        //  decrypt the grade
         char decrypted_grade = (char)(grade - 9);
         System.out.println("The grade after being decrypted : " + decrypted_grade); //  Prints C
    }
}
