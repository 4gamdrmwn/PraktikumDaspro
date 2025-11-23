package Jobsheet11;
import java.util.Scanner;
public class CinemaWithScanner03 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int choice;

        while (true) {
            System.out.println("\n===== Cinema Menu =====");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu (1-3): ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    int row, column;
                    while (true) {
                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt();
                        System.out.print("Enter column number (1-2): ");
                        column = sc.nextInt();
                        sc.nextLine(); 

                        if (row < 1 || row > 4 || column < 1 || column > 2) {
                            System.out.println("X Seat not available. Try again X");
                            continue;
                        }

                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("! Seat already occupied! Choose another seat !");
                            continue;
                        }

                        audience[row - 1][column - 1] = name;
                        break;
                    }

                    System.out.print("Add another audience? (y/n): ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }

            else if (choice == 2) {
                System.out.println("\n===== Audience List =====");
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        if (audience[i][j] == null) {
                            System.out.print("[***]\t");
                        } else {
                            System.out.print("[" + audience[i][j] + "]\t");
                        }
                    }
                    System.out.println();
                }
            }

            else if (choice == 3) {
                System.out.println("Program end");
                break;
            }

            else {
                System.out.println("X Invalid menu choice. Try again X");
            }
        }
        sc.close();
    }
}