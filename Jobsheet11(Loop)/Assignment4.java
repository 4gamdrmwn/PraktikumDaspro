import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        int numSports = sports.length;  
        int athletesPerSport = 5;       
        
        String[][] athletes = new String[numSports][athletesPerSport];
        
        for (int i = 0; i < numSports; i++) {
            System.out.println("Enter names for " + sports[i] + " (5 athletes):");
            for (int j = 0; j < athletesPerSport; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = sc.nextLine();
            }
        }
        
        for (int i = 0; i < numSports; i++) {
            Arrays.sort(athletes[i]);  
        }
        
        System.out.println("Sorted Athlete Names for Porseni 2024:");
        for (int i = 0; i < numSports; i++) {
            System.out.println(sports[i] + ":");
            for (int j = 0; j < athletesPerSport; j++) {
                System.out.println("  - " + athletes[i][j]);
            }
        }
        
        sc.close();
    }
}