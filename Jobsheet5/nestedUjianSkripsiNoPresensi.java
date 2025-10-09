package Jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        System.out.println("Has the student cleared of compensation? (Y/T or Yes / No)");
        String compensation = scanner.nextLine().trim();
        boolean free = compensation.equalsIgnoreCase("Y") || compensation.equalsIgnoreCase("Yes");
        System.out.println("Enter the guidance logs with Supervisor 1:");
        int Supervisor1 = scanner.nextInt();
        System.out.println("Enter the guidance logs with Supervisor 2:");
        int Supervisor2 = scanner.nextInt();
        if (free) {
            if (Supervisor1 >= 8 && Supervisor2 >= 4) {
                message = "All requirements are met. The student can take the thesis exam.";
            } else if (Supervisor1 < 8 && Supervisor2 >= 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8.";
            } else if (Supervisor1 >= 8 && Supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 2 are fewer than 4.";
            } else {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 AND Supervisor 2 are fewer than 4.";
            }
        } else {
            message = "Failed: The student has not been cleared of compensation.";
        }
        System.out.println(message);
        scanner.close();
    }
}
