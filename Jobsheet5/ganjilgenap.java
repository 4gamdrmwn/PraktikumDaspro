package Jobsheet5;

import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ganjil = 0;
        int Genap = 0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < 1; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                Genap += number;
                System.out.println("Genap");
            } else {
                Ganjil += number;
                System.out.println("Ganjil");
            }
        }
    }
}
