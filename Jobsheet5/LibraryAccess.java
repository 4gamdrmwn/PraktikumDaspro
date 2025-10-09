package Jobsheet5;

import java.util.Scanner;
public class LibraryAccess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input bring_id
        System.out.print("Did you bring your ID? (true/false): ");
        boolean bring_id = scanner.nextBoolean();

        // 2. Input registered_online
        System.out.print("Are you registered online? (true/false): ");
        boolean registered_online = scanner.nextBoolean();

        // 3. Check if bring_id is true OR registered_online is true
        if (bring_id || registered_online) {
            // If yes, grant access
            System.out.println("allowed to enter library");
        } else {
            // If no, deny access
            System.out.println("access denied");
        }
        scanner.close();
    }
}
