package CaSEmethOd;

import java.util.Scanner;

public class ScholarshipSingkong {

    // DATA STORAGE (2D Arrays)
    // Row = Student, Column 0 = Name, Column 1 = ID, Column 2 = Type
    static String[][] textData = new String[100][3]; 
    // Row = Student, Column 0 = GPA, Column 1 = Income
    static double[][] numberData = new double[100][2]; 
    static int count = 0; // Counts how many students we have
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int menu;
        // MAIN MENU (Dynamic Flow)
        do {
            System.out.println("\n=====================================================");
            System.out.println("           SCHOLARSHIP REGISTRATION");
            System.out.println("=====================================================");
            System.out.println("1. Add Applicant");
            System.out.println("2. Show All");
            System.out.println("3. Search by Type");
            System.out.println("4. Average GPA by Type");
            System.out.println("0. Exit");
            System.out.print("Choose: "); 
            menu = sc.nextInt();
            sc.nextLine(); // Fix enter key bug
            if (menu == 1) addData();
            else if (menu == 2) showData();
            else if (menu == 3) searchData();
            else if (menu == 4) calculateAvg();
            else if (menu == 0) System.out.println("Thank you. Program finished.");
            else System.out.println("Wrong input! Please choose 0-4 only.");
        } while (menu != 0);
    }
    // FEATURE 1: ADD DATA
    static void addData() {
        System.out.println("\n=== Add New Scholarship Applicant ===");
        System.out.print("Student name                : ");
        textData[count][0] = sc.nextLine();
        System.out.print("Student ID                  : ");
        textData[count][1] = sc.nextLine();
        System.out.print("Latest GPA                  : ");
        String gpaInput = sc.nextLine();
        gpaInput = gpaInput.replace(",", "."); // Convert comma to period
        numberData[count][0] = Double.parseDouble(gpaInput);
        // VALIDATION 0: GPA (Max 4.00)
        while (numberData[count][0] < 0 || numberData[count][0] > 4.0) {
            System.out.println("Error: GPA must be between 0 and 4.00.");
            System.out.print("Latest GPA                  : ");
            gpaInput = sc.nextLine();
            gpaInput = gpaInput.replace(",", "."); // Convert comma to period
            numberData[count][0] = Double.parseDouble(gpaInput);
        }
        // VALIDATION 1: Scholarship Type && Using do-while loop: "Keep asking IF input is wrong"
        int typeInput;
        do {
            System.out.println("Choose scholarship type:");
            System.out.println("1.Regular");
            System.out.println("2.Excellent");
            System.out.println("3.Research");
            System.out.print("Input your choice (1-3): ");
            typeInput = sc.nextInt();
            
            if (typeInput == 1) textData[count][2] = "Regular";
            else if (typeInput == 2) textData[count][2] = "Excellent";
            else if (typeInput == 3) textData[count][2] = "Research";
            else System.out.println("Error: Choose 1, 2, or 3 only.");
            
        } while (typeInput < 1 || typeInput > 3);
        // VALIDATION 2: Income (Max 2,000,000)
        double incomeInput;
        do {
            System.out.print("Parents' Income (max 2000000): ");
            incomeInput = sc.nextDouble();
            if (incomeInput > 2000000) {
                System.out.println("Error: Income too high for scholarship.");
            }
        } while (incomeInput > 2000000);
        numberData[count][1] = incomeInput; // Save income
        count++; // Increase student count
        System.out.println(">> Applicant data has been added.");
    }
    // FEATURE 2: SHOW DATA
    static void showData() {
        System.out.println("\n=== List of All Scholarship Applicants ===");
        if (count == 0) {
            System.out.println("No applicant data yet.");
            return;
        }
        System.out.printf("%-3s %-20s %-18s %-6s %-12s %s\n", "No", "Name", "Student ID", "GPA", "Type", "Income");
        System.out.println("---------------------------------------------------------------------");
        // Nested loop: Outer loop for each student
        for (int i = 0; i < count; i++) {
            System.out.printf("%-3d", (i + 1)); // Print student number
            // Inner loop: Iterates through columns 0 to 4 to match Header order
            // 0=Name, 1=ID, 2=GPA, 3=Type, 4=Income
            for (int col = 0; col < 5; col++) {
                if (col == 0) System.out.printf("%-20s", textData[i][0]);      // Name (Text)
                else if (col == 1) System.out.printf("%-18s", textData[i][1]); // ID (Text)
                else if (col == 2) System.out.printf("%-6.1f", numberData[i][0]); // GPA (Number)
                else if (col == 3) System.out.printf("%-12s", textData[i][2]); // Type (Text)
                else if (col == 4) System.out.printf("%.0f", numberData[i][1]);   // Income (Number)
            }
            System.out.println();
        }
    }
    // FEATURE 3: SEARCH
    static void searchData() {
        System.out.print("\nSearch Type (Regular/Excellent/Research): ");
        String keyword = sc.nextLine();
        System.out.println("Results:");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            // Check if saved Type matches Keyword (ignoring case)
            if (textData[i][2].equalsIgnoreCase(keyword)) {
                System.out.println("- " + textData[i][0] + " (GPA: " + numberData[i][0] + ")");
                found = true;
            }
        }
        if (!found) System.out.println("No students found.");
    }
    // FEATURE 4: AVERAGE GPA
    static void calculateAvg() {
        System.out.println("\n=== Average GPA per Scholarship Type ===");
        String[] types = {"Regular", "Excellent", "Research"};

        for (String t : types) {
            double totalGpa = 0;
            int studentCount = 0;
            for (int i = 0; i < count; i++) {
                if (textData[i][2].equalsIgnoreCase(t)) {
                    totalGpa += numberData[i][0];
                    studentCount++;
                }
            }
            if (studentCount == 0) {
                // Specific message when no applicants for a type
                System.out.println("No applicant for " + t + " Scholarship.");
            } else {
                double avg = totalGpa / studentCount;
                // Show average with one decimal like 4.0
                System.out.printf("Average GPA for %s Scholarship: %.1f\n", t, avg);
            }
        }
    }
}