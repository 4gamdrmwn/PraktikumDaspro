import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
        }
    }