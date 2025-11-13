import java.util.Scanner;

public class NestedLoopStudentID {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < temps[0].length; j++) {
                sum += temps[i][j];  // Sum all days for this city
            }
            double average = sum / temps[0].length;  // Divide by number of days (7)
            System.out.println("City " + i + " average temperature: " + average);
        }


        int cityIndex = 0; 
        for (double[] city : temps) {  
            System.out.println("City: " + cityIndex);
            for (double temp : city) {  
                System.out.print(temp + " ");
            }
            System.out.println();
            cityIndex++;  
        }
    }
}