package Jobsheet5;

import java.util.Scanner;
public class WifiAccess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user type (lecturer/student): ");
        String userType = scanner.nextLine();

        if (userType.equalsIgnoreCase("lecturer")) {
            System.out.println("WiFi access granted (lecturer)");
        }
 
        else if (userType.equalsIgnoreCase("student")) {
            // If the user is a student, ask for their credits
            System.out.print("Input credits: ");
            int credits = scanner.nextInt();

            // 4. Check if the student has 12 or more credits
            if (credits >= 12) {
                System.out.println("WiFi access granted (active student)");
            } else {
                System.out.println("WiFi access denied (inactive student - credits < 12)");
            }
        }
        // Handle cases where the input is neither 'lecturer' nor 'student'
        else {
            System.out.println("Invalid user type. Access denied.");
        }
        scanner.close();
    }
}
