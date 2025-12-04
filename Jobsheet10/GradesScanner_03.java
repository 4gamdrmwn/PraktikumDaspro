package Jobsheet10;

import java.util.Scanner;

public class GradesScanner_03 {
    static int[][] grades;
    static String[] students;
    static int numStudents;
    static int numWeeks;
    static Scanner sc = new Scanner(System.in);
    
    static void inputDimensions() {
        System.out.print("Enter number of students: ");
        numStudents = sc.nextInt();
        System.out.print("Enter number of weeks: ");
        numWeeks = sc.nextInt();
        sc.nextLine(); 
        
        grades = new int[numStudents][numWeeks];
        students = new String[numStudents];
    }
    
    static void inputGrades() {
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
            
            for (int j = 0; j < numWeeks; j++) {
                System.out.print("  Grade for week " + (j + 1) + ": ");
                grades[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    
    static void displayGrades() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("\t");
        for (int j = 0; j < numWeeks; j++) {
            System.out.print("Week " + (j + 1) + "\t");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print(students[i] + "\t");
            for (int j = 0; j < numWeeks; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    
    static void findWeekHighestGrade() {
        int highestGrade = 0;
        int weekIndex = 0;
        
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numWeeks; j++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                    weekIndex = j + 1;
                }
            }
        }
        System.out.println("The highest grade in the entire data is: " + highestGrade);
        System.out.println("It occurred in: Week " + weekIndex);
    }

    
    static void findStudentHighestGrade() {
        int highestGrade = 0;
        int studentIndex = 0;
        
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numWeeks; j++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                    studentIndex = i;
                }
            }
        }
        
        System.out.println("\nThe student with the highest grade is: " + students[studentIndex]);
        System.out.println("Details of " + students[studentIndex] + "'s grades:");
        for (int j = 0; j < numWeeks; j++) {
            System.out.println("Week " + (j + 1) + ": " + grades[studentIndex][j]);
        }
    }

    
    public static void main(String[] args) {
        inputDimensions(); // Get number of students and weeks
        inputGrades(); // Get student names and grades
        System.out.println();
        displayGrades(); // Shows the table
        System.out.println();
        findWeekHighestGrade();
        findStudentHighestGrade();
        sc.close();
    }
}