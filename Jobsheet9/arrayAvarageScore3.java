package Jobsheet9;
import java.util.Scanner;
public class arrayAvarageScore3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of student : ");
        int n = sc.nextInt();
        int[] score = new int[10];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + " : ");
            score[i] = sc.nextInt();
        }
        
        double sumPassed = 0;
        double sumFailed = 0;
        int countPassed = 0;
        int countFailed = 0;

        for (int i = 0; i < n; i++) {
            if (score[i] > 70) {
                sumPassed += score[i];
                countPassed++;
            } else {
                sumFailed += score[i];
                countFailed++;
            }
        }
        double avgPassed = sumPassed / countPassed;
        double avgFailed = sumFailed / countFailed;

        System.out.println("The average score of the passed students is: " + avgPassed);
        System.out.println("The average score of the failed students is: " + avgFailed);

    }
}
    
    
