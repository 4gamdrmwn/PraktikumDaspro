import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (int i = numInput; i >= 1; i--) {
           for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}