package LABS.Lab_02;
import java.util.Scanner;

public class grades_average_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalGrades = 0;
        System.out.print("Enter number of courses: ");
        int totalCourses = sc.nextInt();
        int i  = 1;
        boolean isNegative = false;
        while (i <= totalCourses) {
            System.out.print("Enter your grade for course " + (i)+ ": ");
            int grade = sc.nextInt();
            if(grade < 0){
                isNegative = true;
                System.out.println("Invalid Value!");
                break;
            }
            totalGrades += grade;
            i++;
        }
        if(isNegative == false){
            int avgGrade = totalGrades /totalCourses;
            System.out.println("Average Grade: " + avgGrade);
        }
    } 
}
