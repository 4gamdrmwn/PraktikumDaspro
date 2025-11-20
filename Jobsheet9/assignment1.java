package Jobsheet9;
import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Input n: ");
        int n = input.nextInt();

        int[] grades = new int[n];
        for(int i = 0; i < grades.length; i++){
            grades[i]=input.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
            System.out.print(grades[i] + " - ");
        }
        double avg = sum/grades.length;
        System.out.println("average = " + avg);

        int highest = grades[0];
        int smallest = grades[0];
        for (int i = 1; i < grades.length; i++){
            if(highest < grades[i]){
                highest = grades[i];
            }
            if(smallest > grades[i]){
                smallest = grades[i];
            }
        }
        System.out.println("Highest is " + highest);
        System.out.println("Smallest is " + smallest);
    }
}
       