public class Grades_03 {
    static int[][] grades = new int[5][7];
    static String[] students = new String[5];
    
    static void inputGrades() {
        students = new String[] {"Sari", "Rina", "Yani", "Dwi ", "Lusi"};
        
        int[][] data = {
            {20, 19, 25, 20, 10, 0, 10},
            {30, 30, 40, 10, 15, 20, 25},
            {5, 0, 20, 25, 10, 5, 45},
            {50, 0, 7, 8, 0, 30, 60},
            {15, 10, 16, 15, 10, 10, 5}
        };
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                grades[i][j] = data[i][j];
            }
        }
    }

    
    static void displayGrades() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\tWeek 1\tWeek 2\tWeek 3\tWeek 4\tWeek 5\tWeek 6\tWeek 7");
        System.out.println("-------------------------------------------------------------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(students[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    
    static void findWeekHighestGrade() {
        int highestGrade = 0;
        int weekIndex = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
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
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                    studentIndex = i;
                }
            }
        }
        
        System.out.println("\nThe student with the highest grade is: " + students[studentIndex]);
        System.out.println("Details of " + students[studentIndex] + "'s grades:");
        for (int j = 0; j < 7; j++) {
            System.out.println("Week " + (j + 1) + ": " + grades[studentIndex][j]);
        }
    }

    public static void main(String[] args) {
        inputGrades(); // Loads the example data
        displayGrades(); // Shows the table
        System.out.println();
        findWeekHighestGrade();
        findStudentHighestGrade();
    }
}