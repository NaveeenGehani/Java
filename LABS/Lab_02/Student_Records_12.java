package LABS.Lab_02;
import java.util.Scanner;

public class Student_Records_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A. Create arrays
        int numStudents;
        System.out.print("Enter number of students: ");
        numStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];
        char[] grades = new char[numStudents];

        // B. Take input
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();

            System.out.print("Marks: ");
            marks[i] = scanner.nextInt();

            System.out.print("Grade (A/B/C/etc): ");
            grades[i] = scanner.next().toUpperCase().charAt(0);

            scanner.nextLine(); // consume newline
        }

        // C. Display using regular for loop
        System.out.println("\n--- Student Results (Using for loop) ---");
        System.out.printf("%-15s %-10s %-10s\n", "Name", "Marks", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15s %-10d %-10c\n", names[i], marks[i], grades[i]);
        }

        // D. Display using for-each loop
        System.out.println("\n--- Student Results (Using for-each loop) ---");
        System.out.printf("%-15s %-10s %-10s\n", "Name", "Marks", "Grade");

        int index = 0;
        for (String name : names) {
            System.out.printf("%-15s %-10d %-10c\n", name, marks[index], grades[index]);
            index++;
        }

        scanner.close();
    }
}
