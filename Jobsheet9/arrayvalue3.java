package Jobsheet9;
import java.util.Scanner;
public class arrayvalue3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] finalscore = new int [10];

        for(int i = 0; i < finalscore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalscore[i] = sc.nextInt();

        }
        for (int i = 0; i < 10 ; i++){
            if (finalscore[i] > 70){
                System.out.println("Student " + i + " Passed!");
            }else
            System.out.println("Student " + i + " Failed!");
        }
    }
}
    
